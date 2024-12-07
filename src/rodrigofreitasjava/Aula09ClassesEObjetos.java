package rodrigofreitasjava;


public class Aula09ClassesEObjetos {
    public static void main(String[] args) {

        Carro carro = new Carro() ;
       // carro.setPortas(2);
        //carro.setRodas(4);

        System.out.println("O carro padrão da empresa tem: " + carro.getRodas() + " Rodas " + "\n"
                + " e " + carro.getPortas() + " portas ");

        Carro caminhão = new Carro();
        caminhão.setRodas(8);
        caminhão.setPortas(2);





























        //Carro carro = new Carro();
       // Carro carro2 = new Carro(3,5);
       // System.out.println(carro.getPortas() + "\n" + carro.getRodas());
        //carro.setPortas(1);
        //System.out.println(carro.getPortas());
        //System.out.println(carro2.getPortas());
       // System.out.println(carro2.getRodas());
      //  System.out.println(
        //        Calculo.soma(3,7)
     //   );

    }
}
