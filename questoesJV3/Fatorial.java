import java.util.Scanner;

public class Fatorial {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int n= scanner.nextInt();

    System.out.println("fatorial(Loop)" + fatorialLoop(n));
    System.out.println("fatorial(Recursão)" + fatorialRecursivo(n));
}

    public static int fatorialLoop (int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorialRecursivo (int n) {
        if(n == 0) return 1;
        return n * fatorialRecursivo(n-1);
    }
}