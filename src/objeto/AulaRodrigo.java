package objeto;

public class AulaRodrigo {
    int horario;
    boolean confirmado;
    void status (){
        System.out.println("Horario: " + this.horario);
        System.out.println("Confirmado: " + this.confirmado);
    }

    void aconteceu(){
        if (this.confirmado == true){
            System.out.println("A aula aconteceu");
        }else{
            System.out.println("Não aconteceu a aula");
        }
    }
}
