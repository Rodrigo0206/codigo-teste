public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "rodrigo";
        String nome2 = "rodrigo";
        String nome3 = new String("rodrigo");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
