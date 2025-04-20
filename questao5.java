import java.util.Scanner;

public class Atividades {
     public static void main(String[] args) {
        
        Scanner q4 = new Scanner(System.in);
         
        int populacaoA; 
        int populacaoB;
        int anos = 0;

        double taxaA;
        double taxaB; 

        System.out.println("Digfite aqui a quantidade da população A: ");
        populacaoA = q4.nextInt();

        System.out.println("Digite aqui a quantidade da população B: ");
        populacaoB = q4.nextInt();

        System.out.println("Digite aqui o valor da taxa A: ");
        taxaA = q4.nextDouble();

        System.out.println("Digite aqui o valor da taxa B: ");
        taxaB = q4.nextDouble();

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
       
