public class ContarNumeros {
    public static void main(String[] args) {
        // Defina os 10 números aqui
        int[] numeros = {5, -3, 0, -9, -5, 10, 8, 0, 8, -4};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        // Laço para percorrer os números
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        // Exibir os resultados
        System.out.println("Quantidade de positivos: " + positivos);
        System.out.println("Quantidade de negativos: " + negativos);
        System.out.println("Quantidade de zeros: " + zeros);
    }
}

