import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {             // Este metodo imprimi uma pergunta  no console
                                                         // e continua perguntando ate o usuario digitar N
        int n, s=0;                                      // no final ela soma e imprimi o resultado no console
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n; // é o mesmo que s = s + n;
            System.out.println("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
