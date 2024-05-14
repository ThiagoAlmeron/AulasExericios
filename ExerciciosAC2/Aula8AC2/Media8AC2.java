package Aula8AC2;
import java.util.Scanner;



public class Media8AC2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       double mediaN = 0.0;  
       double pesoN = 0.0;
       double mediafinal = 0.0;  
       int numeroalunos = 0; 
       int numeronotas = 0;
       String nomeA = null;

       System.out.print("Digite a quantidade de alunos: "); 
       numeroalunos = scn.nextInt();

         for(int i = 1; i <= numeroalunos; i++ ){  
           System.out.print("Digite o nome do aluno: "); 
           nomeA = scn.next();
           System.out.print("Digite a quantidade de notas: "); 
           numeronotas = scn.nextInt();

             for(int a = 1; a <= numeronotas; a++ ){
                 System.out.print("Digite a nota " + a + ": "); 
                 mediaN = scn.nextDouble();
               System.out.print("Digite o peso (em porcentagem) da nota " + a + ": "); 
               pesoN = scn.nextDouble();
               mediafinal += mediaN * (pesoN/100);
             }
             
       
    if (mediaN >= 0 && mediaN <= 2) {
        System.out.println( nomeA + " tirou " + mediafinal + " e esta Reprovado"); 
    } else if (mediaN >= 2.1  && mediaN <= 4.9) {
        System.out.println( nomeA + " tirou " + mediafinal + " e tera que fazer substitutiva"); 
    } else {
        System.out.println( nomeA + " tirou " + mediafinal + " e tera esta Aprovado");  
    }

         
        }

        scn.close();
    }
}
