import java.util.Scanner;

public class CaucularIdade {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);  // esse metodo caucula se a pessoa é maior de idade ou nao
        System.out.println("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        int i = 2024-nasc;
        System.out.println("Sua idade é " + i);
        if (i>=18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
