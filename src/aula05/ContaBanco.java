package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada porque ainda tem saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada porque esta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }

    }
    public void depositar(){

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }
    //metodos especiais


    public ContaBanco() {
        this.saldo=0 ;
        this.status=false;
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
