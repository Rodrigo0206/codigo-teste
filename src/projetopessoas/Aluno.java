package projetopessoas;

public class Aluno extends Pessoa{
    //atributos
    private int matricula;
    private String curso;

    //metodos
    public void cancelarMatricula(){
        System.out.println("Matricula sera cancelada");

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
