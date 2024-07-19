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
        System.out.println("Esta ligado? " + this.getLigado());    //Este metodo mostra no console
        System.out.println("Esta tocando? " + this.getTocando());   // se esta ligado e se esta tocando
        System.out.println("Volume: " + this.getVolume());          //e a intensidade do volume
        for (int i = 0; i <= this.getVolume(); i+=10 ){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {                                        //Este metodo so mostra no console
        System.out.println("Fechando menu...");                       // a frase fechando menu
    }

    @Override
    public void maisVolume() {                     //Este metodo aumenta o volume em 5 unidades
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {                      //Este metodo diminui o volume em 5 unidades
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
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
