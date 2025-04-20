import java.util.Scanner;

public class Atividades {
     public static void main(String[] args) {
        
        Scanner q4 = new Scanner(System.in);
         
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

      
        System.out.print("Digite seu nome: ");
        nome = q4.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Nome inválido. Digite novamente: ");
            nome = q4.nextLine();
        }

        
        System.out.print("Digite sua idade: ");
        idade = q4.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida. Digite novamente: ");
            idade = q4.nextInt();
        }

        
        System.out.print("Digite seu salário: ");
        salario = q4.nextDouble();
        while (salario <= 0) {
            System.out.print("Salário inválido. Digite novamente: ");
            salario = q4.nextDouble();
        }

    
        System.out.print("Digite seu sexo (f/m): ");
        sexo = q4.next().toLowerCase().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.print("Sexo inválido. Digite novamente (f/m): ");
            sexo = q4.next().toLowerCase().charAt(0);
        }

        System.out.print("Digite seu estado civil (s/c/v/d): ");
        estadoCivil = q4.next().toLowerCase().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.print("Estado civil inválido. Digite novamente (s/c/v/d): ");
            estadoCivil = q4.next().toLowerCase().charAt(0);
        }

        System.out.println("\nCadastro realizado com sucesso!");
        q4.close();
    }
}