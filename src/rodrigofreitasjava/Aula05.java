package rodrigofreitasjava;

public class Aula05 {
    public static void main(String[] args) {

        String pessoa = "mamifer";

        switch (pessoa){

            case "homen":
                System.out.println("è um humano");
                break;

            case "mamifero":
                System.out.println("è um animal");
                break;
            default:
                System.out.println("valor incorreto");
                break;
        }

    }
}
