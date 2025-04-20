import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = q4.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = q4.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números entre " + num1 + " e " + num2 + ":");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        q4.close();
    }
}
