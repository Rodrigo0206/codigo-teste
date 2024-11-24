package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       // (argumento) -> expression
          //      (argumento, argumento) -> expression
            //    () -> {bloco}

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("rodrigo",37));
        clientes.add(new Cliente("pedro",20));
        clientes.add(new Cliente("carlos",40));
        clientes.add(new Cliente("arthur",10));
        clientes.add(new Cliente("francisco",20));
        clientes.add(new Cliente("marcos",15));
        clientes.add(new Cliente("paulo",70));
        clientes.add(new Cliente("gustavo",18));

        long v = clientes.stream()
                .filter(c -> c.getIdade() < 18).count();

        System.out.println(v);

        clientes.forEach(c ->
                System.out.println(c.getNome())
        );











       /*for(Cliente v : clientes){
           print(v.getNome());
        }

    }
    private static void print(String x){
        System.out.println(x);*/
    }
}
