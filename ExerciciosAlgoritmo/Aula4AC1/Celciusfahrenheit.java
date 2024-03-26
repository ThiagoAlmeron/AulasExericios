import java.util.Scanner;


public class Celciusfahrenheit {

    public static void main(String[] args) {
    
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realia a conversao de celcius para fahrenheit");

        // Solicita e recebe o valor em celcius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em celcius : ");
        double grau = scanner.nextDouble();

        // Calcula o celcius em fahrenheit

        double  resultadoFahr = (grau * 9 / 5 ) + 32;


        // mostra o resultado ao usuario
        System.out.print("A temperatura em fahrenheit " + resultadoFahr);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

        }   
    
    }






