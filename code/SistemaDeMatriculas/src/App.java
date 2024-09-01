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
                System.out.print("Selecione o tipo de usuario:\n1-Aluno\n2-Professor\n");
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
        
        System.out.println("Digite seu Email: ");

        String email = scanner.nextLine();
        scanner.next();

        if(tipoUser==1){
            //pesquisar aluno no banco
        }
        else{
            //pesquisar professor no banco
        }

        
    }
}
