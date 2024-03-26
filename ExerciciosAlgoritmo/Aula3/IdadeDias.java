import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza a tranformacao de Idade em Dias.");
        

        // Solicita e recebe a idade
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade desejada ");
        int idade = scanner.nextInt();

        // Calcula a idade em dias
        int resultadoemDias = idade * 365 ;

        // Exibe o resultado para o usuário
        System.out.println("A idade em dias é aproximadamente "  + resultadoemDias);
    

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();


    }
}

