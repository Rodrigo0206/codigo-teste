package rodrigofreitasjava;

public class pessoa {
    Integer idade;
    String nome;

    public pessoa(Integer idade, String nome) {
        this.idade = 1;
        this.nome = "rod";
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
