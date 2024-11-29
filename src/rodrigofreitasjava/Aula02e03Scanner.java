package rodrigofreitasjava;

import java.util.Scanner;

public class Aula02e03Scanner {
    public static void main(String[] args) {

        /*String numero = "50";
        String numero2 = "10";

        //System.out.println(numero + numero2);

        Integer x = Integer.valueOf(numero);
        Integer y = Integer.valueOf(numero2);
       // System.out.println(x + y);

        Float a = 1.5f;
        Double b = 2.0;
        Double soma = (a + b);
        //System.out.println(soma);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo , qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite um numero: ");
        Integer numero = Integer.valueOf(scanner.nextLine()) ;
        System.out.println("Digite outro numero: ");
        Integer outroNumero = Integer.parseInt(scanner.nextLine()) ;

        //Integer x = Integer.parseInt(numero );
        //Integer y = Integer.parseInt(outroNumero);
        Integer soma = numero + outroNumero;
        System.out.println("A soma desses dois numeros é : " + soma);
    }
}
