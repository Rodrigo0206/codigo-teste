public class OperadorTernario {
   /* public static void main(String[] args) {
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1;
        System.out.println(r);*/
   public static void main(String[] args) {
       String nome1 = "rodrigo";
       String nome2 = "rodrigo";
       String nome3 = new String("rodrigo");
       String res;
       res = (nome1.equals(nome3))?"igual":"diferente";
       System.out.println(res);
   }

}
