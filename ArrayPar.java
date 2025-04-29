// Questão 12

public class ArrayPar {
    public static void main(String[] args) {
      
        int[] numerosPares = new int[10];

        for (int i = 0; i < 10; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        System.out.println("Os primeiros 10 números pares são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numerosPares[i]);
        }
    }
}
