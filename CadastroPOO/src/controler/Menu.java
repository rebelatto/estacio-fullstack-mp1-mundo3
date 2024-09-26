package controler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner; 
    
    public Menu (){
        this.scanner = new Scanner(System.in);
    }
    
    public void exibirMenu(){
      try{
            int opcao;
            do {
                System.out.println("");
                System.out.println("===========================");
                System.out.println("========== MENU ===========");
                System.out.println("1 - Incluir Pessoa");
                System.out.println("2 - Alterar Pessoa");
                System.out.println("3 - Excluir Pessoa");
                System.out.println("4 - Buscar pelo Id");
                System.out.println("5 - Exibir Todos");
                System.out.println("6 - Persistir Dados");
                System.out.println("7 - Recuperar Dados");
                System.out.println("0 - Finalizar Programa");
                System.out.println("===========================");
                System.out.println("");
                
                System.out.print("Escolha uma opção: ");
                
                try {
                    opcao = scanner.nextInt();
                    executarAcao(opcao);
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanner.next();  // Limpa o buffer do Scanner
                    opcao = -1;  // Define opcao para um valor inválido para repetir o loop
                }
                
            } while (opcao != 0);
        } finally {
            scanner.close();
        }         
    }

    private void executarAcao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("Você escolheu a Opção 1");
                // Lógica para Opção 1
                break;
            case 2:
                System.out.println("");
                System.out.println("Você escolheu a Opção 2");
                // Lógica para Opção 2
                break;
            case 3:
                System.out.println("");
                System.out.println("Você escolheu a Opção 3");
                // Lógica para Opção 2
                break;
            case 4:
                System.out.println("");
                System.out.println("Você escolheu a Opção 2");
                // Lógica para Opção 2
                break;
            case 5:
                System.out.println("");
                System.out.println("Você escolheu a Opção 2");
                // Lógica para Opção 2
                break;
            case 6:
                System.out.println("");
                System.out.println("Você escolheu a Opção 2");
                // Lógica para Opção 2
                break;
            case 7:
                System.out.println("");
                System.out.println("Você escolheu a Opção 2");
                // Lógica para Opção 2
                break;
            case 0:
                System.out.println("");
                System.out.println("Encerrando a Execução do Programa...");
                break;
            default:
                System.out.println("");
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
    }
}
