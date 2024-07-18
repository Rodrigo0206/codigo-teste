package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();       //Essa classe é um banco,
        p1.setNumConta(1111);                   //que crio um usuario, posso
        p1.setDono("Rodrigo");                  //colocar saldo, tirar saldo,
        p1.abrirConta("CC");                  // abrir conta, fechar conta
                                                //e no estadoAtual ele mostra o status
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Ricardo");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p2.sacar(550);
        p2.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
