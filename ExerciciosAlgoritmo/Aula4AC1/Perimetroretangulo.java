import java.util.Scanner;

public class Perimetroretangulo{
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o perimetro de um retangulo.");

        // Solicita e recebe o primeiro número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do menor lado: ");
        int ladoMenor = scanner.nextInt();

        // Solicita e recebe o segundo número do usuário
        System.out.print("Digite o valor do Maior lado: ");
        int ladoMaior = scanner.nextInt();

        // Calcula o perimetro do retangulo
        int resultadoPerimetro =(ladoMaior + ladoMenor) * 2;

        // Exibe o resultado para o usuário
        System.out.println("O valor do perimetro é: " + resultadoPerimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}






