package rodrigofreitasjava;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite genero : ");
        String genero = scanner.nextLine();

        //String pessoa = "mamifero";

        switch (genero){

            case "homen":
            case "menino":

                System.out.println("è masculino");
                break;

            case "mulher":
                System.out.println("è feminino");
                break;

            default:
                System.out.println("valor incorreto");
                break;
        }

    }
}
