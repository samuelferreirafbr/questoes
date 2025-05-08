import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {

        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor A: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor B: "));

    JOptionPane.showInputDialog("Escolha a operação: ");

    float adicao = num1 + num2;
    float subtracao = num1 - num2;
    float multiplicacao = num1 * num2;
    float divisao = num1 / num2;


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

