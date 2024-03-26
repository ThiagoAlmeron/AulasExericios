import java.util.Scanner;

public class Perimetrotriangulo{
    
        public static void main(String[] args) {
            // Informa ao usuário sobre o propósito do programa
            System.out.println("Este programa realiza o perimetro de um retangulo.");
    
            // Solicita e recebe o primeiro número do usuário
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor de um dos lados do triangulo: ");
            int ladoA = scanner.nextInt();
    
            // Solicita e recebe o segundo número do usuário
            System.out.print("Digite o valor de outro lado do triangulo: ");
            int ladoB = scanner.nextInt();


            // Solicita e recebe o terceiro número do usuário
            System.out.print("Digite o valor do ultimo lado restante ");
            int ladoC = scanner.nextInt();
    
            // Calcula a soma dos dois números
            int resultadoPerimetroT =(ladoA + ladoB + ladoC);
    
            // Exibe o resultado para o usuário
            System.out.println("O valor do perimetro é: " + resultadoPerimetroT);
    
            // Fecha o scanner para evitar vazamento de recursos
            scanner.close();
        }
}
