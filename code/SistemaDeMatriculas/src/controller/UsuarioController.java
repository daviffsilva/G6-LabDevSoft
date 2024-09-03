package controller;

import util.DatabaseConnector;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class UsuarioController {
    protected String tabelaUsuario;

    public UsuarioController(String tabelaUsuario){
        this.tabelaUsuario = tabelaUsuario;
    }

    public boolean autenticar(String email, String senha) {
        PreparedStatement statementUsuario = DatabaseConnector.getInstance().prepareStatement("SELECT id FROM usuario WHERE email = ? AND senha = ?");
        try{
            statementUsuario.setString(1, email);
            statementUsuario.setString(2, senha);
            statementUsuario.execute();
            ResultSet resultSetUsuario = statementUsuario.getResultSet();
            if(!resultSetUsuario.next()){
                return false;
            }else{
                int idUsuario = resultSetUsuario.getInt(1);
                statementUsuario.close();

                PreparedStatement statementTipoUsuario = DatabaseConnector.getInstance().prepareStatement("SELECT id_usuario FROM " + tabelaUsuario + " WHERE id_usuario = ?");
                statementTipoUsuario.setInt(1, idUsuario);
                statementTipoUsuario.execute();

                ResultSet resultSetTipoUsuario = statementTipoUsuario.getResultSet();
                boolean resultadoEncontrado = resultSetTipoUsuario.next();

                statementTipoUsuario.close();
                return resultadoEncontrado;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }

        return false;
    }
}
