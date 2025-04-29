import java.util.Scanner;

// Questão 11

class MaiorNumero{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

scanner.close();

    }
}