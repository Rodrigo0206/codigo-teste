package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("rodrigo");
        p2.setNome("maria");
        p3.setNome("gihh");
        p4.setNome("ricardo");

        p1.setSexo("M");
        p4.setSexo("M");
        p2.setIdade(18);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
