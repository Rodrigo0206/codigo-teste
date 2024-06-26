public class Contador {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<=20){ // é um contador utilizando o while ou "enquanto"

            cc++;
            if (cc == 2 || cc ==3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("pulo " + cc);
        }
    }

}
