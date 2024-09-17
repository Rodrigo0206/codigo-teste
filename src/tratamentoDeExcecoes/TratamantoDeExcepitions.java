package tratamentoDeExcecoes;

public class TratamantoDeExcepitions {
    public static void main(String[] args) {



        try {
            System.out.println("teste");
            System.out.println(2/0);

        }catch (Exception ex){
            System.out.println("Tentou dividir por Zero");
        }
        System.out.println("outro teste");

    }

}
