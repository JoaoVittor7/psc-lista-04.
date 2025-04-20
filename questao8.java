import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5, soma, media;

        System.out.println("Digite abaixo 5 numeros diferentes: ");

        numero1 = q4.nextInt();
        numero2 = q4.nextInt();
        numero3 = q4.nextInt();
        numero4 = q4.nextInt();
        numero5 = q4.nextInt();

        soma = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.print("Valor da soma dos 5 numeros: "+soma);

        media = soma/5;

        System.out.print("\n Valor da media: "+media);
       

        q4.close();
    }
}
