import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cadastro cadastro=new Cadastro();
        Scanner scanner = new Scanner(System.in);

        int opcao;
         do{
            System.out.println("1.Cadastrar Pessoa");
            System.out.println("2.Listar Pessoa");
            System.out.println("3.Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine();//Consome a nova linha

            switch (opcao){
                case 1:
                System.out.println("Digite o nome:");
                String nome = scanner.nextLine();
                System.out.println("Digite a idade");
                int idade =  scanner.nextInt();
                scanner.nextLine();//Consome a nova linha
                Pessoa pessoa =new Pessoa(nome, idade);
                cadastro.adicionarPessoa(pessoa);
                break;

                case 2:
                System.out.println("Pessoas Cadastradas:");
                for (Pessoa p :cadastro.listarPessoas()){
                    System.out.println(p);
                }
                break;
                 case 3:
                 System.out.println("Saindo...");
                 break;
                 default:
                 System.out.println("Opção Invalida.");
                 break;

            }

        } while(opcao!=3);

        scanner.close();

    }

}
