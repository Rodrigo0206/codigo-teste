package hakerhank;
import java.util.Scanner;

public class Java06_08DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada do usuário
        System.out.print("Digite um número: ");
        long numero = scanner.nextLong();

        // Verificar o tipo do número
        if (numero >= Byte.MIN_VALUE && numero <= Byte.MAX_VALUE) {
            System.out.println("O número " + numero + " pode ser representado como um byte (8 bits).");
        } else if (numero >= Short.MIN_VALUE && numero <= Short.MAX_VALUE) {
            System.out.println("O número " + numero + " pode ser representado como um short (16 bits).");
        } else if (numero >= Integer.MIN_VALUE && numero <= Integer.MAX_VALUE) {
            System.out.println("O número " + numero + " pode ser representado como um int (32 bits).");
        } else {
            System.out.println("O número " + numero + " pode ser representado como um long (64 bits).");
        }

        scanner.close();






    }
}
