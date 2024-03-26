import java.util.Scanner;




public class HorasMinutos {
    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza a tranformaçao de Horas e minutos.");
        

        // Solicita e recebe as horas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o horario: ");
        int primeiroNumero = scanner.nextInt();

        // Calcula as horas em minutos
        int resultadoemMinutos = primeiroNumero * 60;

        // Exibe o resultado para o usuário
        System.out.println("As horas em minutos é "  + resultadoemMinutos);
    

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();


 
    }

    
}
