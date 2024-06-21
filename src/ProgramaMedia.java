import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("A primeira nota é: ");
        float numero1 = teclado.nextFloat();
        System.out.println("A segunda nota é: ");
        float numero2 = teclado.nextFloat();
        float media = (numero1+numero2)/2;
        System.out.println("Sua media foi: " +media );
        if (media>7){
            System.out.println("Parabens !!!");
        }
    }
}
