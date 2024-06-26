import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);  //Esse programa  utiliza o swith
        System.out.println("Quantas pernas? ");// para contar a quantidade de pernas digitada pelo usuario
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
