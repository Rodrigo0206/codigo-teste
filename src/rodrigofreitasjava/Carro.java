package rodrigofreitasjava;

public class Carro {

    private Integer rodas ;
    private Integer portas ;

    public Carro() {
        this.rodas = 2;
        this.portas = 2;
    }

    public Carro(int rodas, int portas) {
        this.rodas = rodas;
        this.portas = portas ;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
}
