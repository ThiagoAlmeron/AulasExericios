import java.util.Scanner;



public class Modulo {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o modulo de dois numeros.");

        // Solicita e recebe o primeiro número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Solicita e recebe o segundo número do usuário
        System.out.print("Digite o segundo número (sem ser o numero 0): ");
        int segundoNumero = scanner.nextInt();

        // Calcula o modulo dos dois numeros
        int resultadoModulo = primeiroNumero % segundoNumero;

        // Exibe o resultado para o usuário
        System.out.println("O Modulo de " + primeiroNumero + " por " + segundoNumero + " é: " + resultadoModulo);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}

    




