package aula06;
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos especiais


    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
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
        System.out.println("-----------MENU------------");
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
        }else {
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {                      //Este metodo diminui o volume em 5 unidades
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {                           //Este metodo deixa mudo
        if (this.getLigado() && this.getVolume() > 0){   // se o volume for maior que 0
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {                         // Este metodo desliga o mudo
        if (this.getLigado() && this.getVolume() == 0){   //voltando o volume para o 50
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else {
            System.out.println("Não consegui reproduzir");
        }
    }
}
