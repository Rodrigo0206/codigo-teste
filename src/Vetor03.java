import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {

        int vet[] = {3, 7, 6, 1, 9, 4, 2};  // Este metodo imprimi no console um vetor
        for(int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 1);  // essa classe busca no vetor o numero requisitado
        System.out.println("Encontrei o valor na posiçao " + p);
    }
}
