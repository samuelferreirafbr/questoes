import java.util.Scanner;

public class InverterString {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma String: ");

        String original = scanner.nextLine();
        String invertida = new StringBuilder(original).reverse().toString();
        System.out.println("Invertida: " + invertida);

        scanner.close(); 
    }
}
