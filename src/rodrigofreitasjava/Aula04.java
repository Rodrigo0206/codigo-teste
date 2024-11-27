package rodrigofreitasjava;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

       // Scanner scanner = new Scanner(System.in);
        //Integer idade = Integer.valueOf(Integer.scanner);
        Integer a = 150;
        if (a >= 18 && a <=65){
            System.out.println("Maior de 18");
        } else if (a <= 12) {
            System.out.println(" Você é uma crianca ");
        } else if (a < 18 && a > 12) {
            System.out.println("Você é um adolescente ");
        }else
            System.out.println("idoso");


    }
}
