package rodrigofreitasjava;

public class Aula08Metodos {
    public static void main(String[] args) {



        Integer a = 3;
        Integer b = 2;

        calculo(a,b);

    }
    private static void  calculo(Integer a, Integer b){
        Integer soma = 0 ;

        if ( a % 2 ==0) {
            soma = a +b;

        }
        else {
            soma = a * b;
        }
        System.out.println(soma);





    }
}
