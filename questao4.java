import java.util.Scanner;

public class Atividades {
     public static void main(String[] args) {
        
        Scanner q4 = new Scanner(System.in);
        int populacaoA = 80000;
        int populacaoB = 200000;
        int anos = 0;

        double taxaA = 0.03;  
        double taxaB = 0.015; 

      
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("A população do país A ultrapassará ou igualará a de B em " + anos + " anos.");
        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        q4.close();
    }
}
       
