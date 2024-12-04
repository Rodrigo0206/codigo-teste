package rodrigofreitasjava;

public class Aula08 {
    public static void main(String[] args) {

        Integer a = 3;
        Integer b = 2;
        Integer soma = 0;

        soma = calculo(a,b);
        System.out.println(soma);
    }
    private static Integer calculo(Integer a, Integer b){
        Integer soma = 0 ;

        if ( a % 2 ==0) {
            soma = a +b;

        }
        else {
            soma = a * b;
        }
        return soma;




    }
}
