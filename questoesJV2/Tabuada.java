public class Tabuada {
    public static void main(String[] args) {

        // Digite o número aqui
        int numero = 7;

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}