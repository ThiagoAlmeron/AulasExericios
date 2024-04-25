import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa mostra o quadrado de um numero desejado.");

        // Solicita e recebe o numero 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero para calcular o quadrado dele: ");
        int Numero = scanner.nextInt();

        // Calcula o numero ao quadrado
        int resultadoQuadrado = Numero * Numero ;

        // Exibe o resultado para o usuário
        System.out.println("0 quadrado de "  + Numero + " é " +  resultadoQuadrado);
    

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();


    }
}