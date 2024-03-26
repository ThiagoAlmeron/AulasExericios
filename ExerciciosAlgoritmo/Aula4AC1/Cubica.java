import java.util.Scanner;
import java.lang.Math;

public class Cubica {
   
public static void main(String[] args) {
    
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza a raiz cubica de um numero.");

        // Solicita e recebe o numero do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        double numero = scanner.nextDouble();

        // Calcula a raiz cubica do numero
        
        double numeroResultado = Math.cbrt(numero); 


        //mostra o resultado ao usuario
        System.out.print("A raiz cubica é " + numeroResultado);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
 }