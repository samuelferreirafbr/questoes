import java.util.Scanner;

public class ValidaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            // Valida a idade
            if (idade < 0 || idade > 150) {
                throw new IllegalArgumentException("Erro! A idade deve ser entre 0 e 150.");
            }

            System.out.println("Idade válida: " + idade);
            } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            } finally {
                scanner.close();
        }
    }
}
