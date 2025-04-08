public class Calculadora {
    public static void main(String[] args) {

    // Escolha o primeiro numero
        double num1 = 10;

    // Escolha o segundo numero
        double num2 = 5;

    // Escolha a operação ( +, -, *, / )
        char operacao = '+';

        double resultado = 0;

        if (operacao == '+') resultado = num1 + num2;
        else if (operacao == '-') resultado = num1 - num2;
        else if (operacao == '*') resultado = num1 * num2;
        else if (operacao == '/') {
            if (num2 != 0) resultado = num1 / num2;
            else {
                System.out.println("Erro: Divisão por zero!");
                return;
            }
        } else {
            System.out.println("Essa operação é inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}

