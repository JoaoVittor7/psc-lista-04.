import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5, maior;

        System.out.println("Digite abaixo 5 numeros diferentes: ");

        numero1 = q4.nextInt();
        numero2 = q4.nextInt();
        numero3 = q4.nextInt();
        numero4 = q4.nextInt();
        numero5 = q4.nextInt();

        maior = numero1;

        if (numero2 > maior) 
        {maior = numero2;}

        if (numero3 > maior) 
        {maior = numero3;}

        if (numero4 > maior) 
        {maior = numero4;}

        if (numero5 > maior) 
        {maior = numero5;}

        System.out.println("O maior número é: " + maior);

        q4.close();
    }
}
