public class ArrayNumPar {
    public static void main (String[] args) {
       int[] pares = new int[10];
       for (int i = 0; i < pares.length; i++) {
            pares[i] = 2 * i;
       }
       System.out.println("Primeiros 10 pares");
        for(int num: pares) {
            System.out.println(num + "");
        }
    }
}