package aula06;
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos especiais


    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos abstratos
    @Override
    public void ligar() {                     //Este metodo liga o controle
        this.setLigado(true);
    }

    @Override
    public void desligar() {                   //Este metodo desliga o controle
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10 ){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
