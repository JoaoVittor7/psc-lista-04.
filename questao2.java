import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) throws Exception {
        
        Scanner q4 = new Scanner(System.in);
        String nomeUsuario, senha;

        
        System.out.println("Digite aqui o seu nome de usuario: ");
        nomeUsuario = q4.next();

        System.out.println("Digite aqui sua senha: ");
        senha = q4.next();

        if(nomeUsuario.equals(senha))
        {System.out.println("Impossivel prosseguir.");}

        else{System.out.println("Nome de usuario: "+nomeUsuario);
        System.out.println("Senha: "+senha);}

        q4.close();
    }
}