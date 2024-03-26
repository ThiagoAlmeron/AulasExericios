

import java.util.Scanner;

public  class Juros {

    public static void main(String[] args) {
    
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo de juros simples");

        // Solicita e recebe o Capital
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Capital ");
        double capital = scanner.nextDouble();

         // Solicita e recebe a taxa de juro
         
         System.out.print("Digite a taxa de juro ");
         double taxaJuro = scanner.nextDouble();

         //Solicita e recebe o tempo
         
         System.out.print("Digite o tempo em meses");
         double tempo = scanner.nextDouble();

         //calcula o juros simples

         double resultadoJuros = capital * taxaJuro * tempo;

         //mostra o resultado ao usuario
        System.out.print("0 juro simples é:" + resultadoJuros  );

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();


         




         




         
    
    
    
    }
            
}
