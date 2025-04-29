// Questão 16

public class ArraySoma {
    public static void main(String[] args) {
      
        int[] somaArray = {5, 3, 2, 10};

        int soma = 0;
        for (int num : somaArray) {
            soma += num;
        }

        System.out.println("A soma será: " + soma);
    }
}