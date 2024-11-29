package rodrigofreitasjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula07ArrayMatrizVetor {
    public static void main(String[] args) {
       String [] lista = new String[3];
       lista [0] = "rodrigo";
       lista [1] = "ricardo";
       lista [2] = "sol";

        System.out.println("O primeiro nome é: " + lista[0] + "\n"
                + "O segundo nome é: " + lista[1] + "\n"
                + "O terceiro nome é: " + lista[2]);





       /* for (Integer  i = 0; i < 3 ; i ++){
            System.out.println("Digite o nome na posição : " + i);
            lista[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("O primeiro nome digitado é: " + lista[0]);
        System.out.println("O segundo nome digitado é: " + lista[1]);
        System.out.println("O terceiro nome digitado é: " + lista[2]);*/






        /* String [] lista = new String[3];


        for (Integer i = 0; i < 3; i++){
            System.out.println("Digite um nome pra posição :" + i);
            lista[i] = new Scanner(System.in).nextLine();
        }
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);*/
    }
}
