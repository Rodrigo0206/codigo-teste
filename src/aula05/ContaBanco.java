package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos personalizados
    public void abrirConta(){

    }
    public void fecharConta(){

    }
    public void depositar(){

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }
    //metodos especiais


    public ContaBanco() {
        this.setSaldo(0) ;
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
