package MeuPacote;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        String nome, sexo, estadoCivil;
        float salario;
        int idade;

        System.out.println("Informe o seu nome:");
        Scanner sc1 = new Scanner(System.in);
        nome = sc1.next();

        System.out.println("Informe o seu sexo:");
        Scanner sc2 = new Scanner(System.in);
        sexo = sc2.next();

        System.out.println("Informe a sua idade:");
        Scanner sc3 = new Scanner(System.in);
        idade = sc3.nextInt();

        System.out.println("Informe seu estado civil:");
        Scanner sc4 = new Scanner(System.in);
        estadoCivil = sc4.next();

        System.out.println("Informe o seu salario:");
        Scanner sc5 = new Scanner(System.in);
        salario = sc5.nextFloat();

        System.out.println("O trabalhador "+nome+"\ndo sexo "+sexo+"\nde idade "+idade+"\nde estado civil "+estadoCivil+"\ne salario R$"+salario+"\nencontra-se empregado neste estabelecimento.");


    }
}
