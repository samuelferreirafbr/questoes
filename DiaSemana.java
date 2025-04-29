import java.util.Scanner;

// Questão 17

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para verificar o dia da semana:");
        int num = scanner.nextInt();

        String dia;

        switch (num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número de dia inválido! Por favor digite um número entre 1 e 7.";
        }

        System.out.println("O dia é: " + dia);

        scanner.close();
    }
}
