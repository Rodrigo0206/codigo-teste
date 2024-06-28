public class Vetor {
    public static void main(String[] args) {

        String mes[] = {"janeiro","fevereiro","março","abril",//Este metodo usa um for em um vetor para mostrar no console
                "maio","junho","julho","agosto","setembro",   // cada mes e se esse mes tem 30 ou 31 dias
                "outubro","novembro","dezembro"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
                30, 31};
        for(int c=0; c<mes.length; c++){
            System.out.println("O mes de " + mes[c] + " tem " +
                    total[c] + " dias ao ano");
        }
    }
}
