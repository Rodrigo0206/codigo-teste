package rodrigofreitasjava;

public class Mamifero {

    private Integer patas ;

    public Mamifero() {
        this.patas = 2 ;
    }
    public void som() {
        System.out.println("som de mamifero");
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }
}
