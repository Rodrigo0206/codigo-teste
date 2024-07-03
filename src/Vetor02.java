import java.util.Arrays;

public class Vetor02 {
    public static void main(String[] args) {// Este metodo imprimi no console
                                            // o conteudo das posições do vertor v
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);// essa classe organiza o vetor em ordem crescente
        for (double valor: v){
            System.out.println(valor +" ");
        }
    }
}
