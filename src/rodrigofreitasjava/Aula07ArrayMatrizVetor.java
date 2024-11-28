package rodrigofreitasjava;

import java.util.Scanner;

public class Aula07ArrayMatrizVetor {
    public static void main(String[] args) {
        String [] array = new String[3];

        for (Integer i = 0; i < 3; i++){
            System.out.println("Digite um nome pra posição :" + i);
            array[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
