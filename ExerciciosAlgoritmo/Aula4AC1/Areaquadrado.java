import java.util.Scanner;

public class Areaquadrado {
    

    public static void main(String[] args) {


        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo da area de um quadrado");

        // Solicita e recebe o valor do lado do quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado ");
        int numero = scanner.nextInt();

        // Calcula a Area do quadrado
        
        int resultadoArea = (numero * numero);



        // Exibe o resultado para o usuário
        System.out.println("O valor da Area é: " + resultadoArea);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }




}