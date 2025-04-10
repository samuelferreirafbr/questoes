import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirNumeros{
        public double numero1;
        public double numero2;
        public double resultado;

        public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        DividirNumeros dividir = new DividirNumeros();
try{

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (dividir.numero2 == 0) {
                throw new ArithmeticException("Erro! Não pode dividir por zero");
        }

        double resultado = numero1 / numero2;
        System.out.println("O resultado é: " + dividir.resultado);

} catch (InputMismatchException e) {
                System.out.println("Erro! A entrada precisa ser numérica");

} catch (ArithmeticException e) {
                System.out.println(e.getMessage());
        }

 finally {
}
        scanner.close(); 
        }
}