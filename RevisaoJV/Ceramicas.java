import java.util.Scanner;

// Questão 19

public class Ceramicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Terreno

        System.out.println("As dimensões do terreno:");
        System.out.print("Largura do terreno (metros): ");

        double larguraTerreno = scanner.nextDouble();
        System.out.print("Comprimento do terreno (metros): ");

        double comprimentoTerreno = scanner.nextDouble();

// Cerâmica
    
        System.out.println("\nInforme as dimensões da cerâmica:");
        System.out.print("Largura da cerâmica (metros): ");

        double larguraCeramica = scanner.nextDouble();
        System.out.print("Comprimento da cerâmica (metros): ");
        double comprimentoCeramica = scanner.nextDouble();

// Cálculo qtd de cerâmicas
        
        int ceramicasLinha = (int) Math.ceil(larguraTerreno / larguraCeramica);
        int ceramicasColuna = (int) Math.ceil(comprimentoTerreno / comprimentoCeramica);
        int totalCeramicas = ceramicasLinha * ceramicasColuna;

        int  cor1 = 0;
        int cor2 = 0;
        for (int coluna = 1; coluna <= ceramicasColuna; coluna++) {

            if (coluna % 2 == 0) {
                cor1 += ceramicasLinha;

            } else {
                cor2 += ceramicasLinha;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cerâmicas necessárias: " + totalCeramicas);
        System.out.println("Cerâmicas para cor 1 (colunas pares): " + cor1);
        System.out.println("Cerâmicas para cor 2 (colunas ímpares): " + cor2);

        scanner.close();
    }
}
