package entrevista;

import java.util.ArrayList;
import java.util.List;

public class Entrevista {
    public static void main(String[] args) {



        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        //System.out.println(list);
        //list.forEach(x -> System.out.println(x + 1));
        /*Integer [] lista = new Integer[10];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = 4;
        lista[4] = 5;
        lista[5] = 6;
        lista[6] = 7;
        lista[7] = 8;
        lista[8] = 9;
        lista[9] = 10;

        System.out.println(lista[0] + "\n" + lista[1] +"\n" + lista[2] + "\n" + lista[3] + "\n"+ lista[4] + "\n" + lista[5] + "\n" + lista[6] + "\n" +
                lista[7] + "\n" + lista[8] + "\n" + lista[9] );*/

        //List<Integer> lista = new ArrayList<>();
        //for (Integer a = 1 ;  a <= 10000; a ++ ){
        //    lista.add(a);
        //}
        System.out.println(list.get(4) + list.get(6));
    }
}
