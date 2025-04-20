import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q4 = new Scanner(System.in);
        int nota;

        System.out.println("Digite aqui uma nota entre 0 e 10: ");
        nota = q4.nextInt();

        if(nota<1 || nota>10)
        {System.out.println("Nota invalida, gentileza tentar novamente. ");}

        else{System.out.println("Valor da nota: "+nota);}

        q4.close();
    }
} 