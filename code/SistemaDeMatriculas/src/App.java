import controller.AlunoController;
import controller.ProfessorController;
import controller.UsuarioController;
import model.Aluno;
import util.DatabaseConnector;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        //criar array de usuarios? puxar do banco?
        //Usuario aluno = new Aluno();
        //Usuario professor = new Professor();
        int tipoUser;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Selecione o tipo de usuario:\n1 - Aluno\n2 - Professor\n");
                System.out.print("Tipo de usuário: ");
                tipoUser = scanner.nextInt();

                if (tipoUser != 1 && tipoUser != 2) {
                    System.out.println("Erro: O número deve ser 1 ou 2.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
        scanner.nextLine();
        while(true){
            System.out.print("Digite seu Email: ");
            String email = scanner.nextLine();

            System.out.print("Digite sua senha: ");

            String senha = scanner.nextLine();

            UsuarioController controller;
            if(tipoUser==1){
                controller = new AlunoController();
            }
            else{
                controller = new ProfessorController();
            }

            boolean autenticado = controller.autenticar(email, senha);

            if(autenticado){
                System.out.println("Usuário autenticado!");
                break;
            }else{
                System.out.println("Email ou senha incorreto(s)!");
            }
        }
    }
}
