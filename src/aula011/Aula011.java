package aula011;

public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("rodrigo");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("rodrigo");
        a1.setMatricula(1111);
        a1.setCurso("info");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("ricardo");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Professor professor = new Professor();
        professor.receberAumento();

        Tecnico tecnico = new Tecnico();
        tecnico.praticar();

    }
}
