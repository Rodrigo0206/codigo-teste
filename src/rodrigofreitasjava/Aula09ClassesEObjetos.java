package rodrigofreitasjava;


public class Aula09ClassesEObjetos {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro(3,5);
        System.out.println(carro.getPortas() + "\n" + carro.getRodas());
        //carro.setPortas(1);
        System.out.println(carro.getPortas());
        System.out.println(carro2.getPortas());
        System.out.println(carro2.getRodas());

    }
}
