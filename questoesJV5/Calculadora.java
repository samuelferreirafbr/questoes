import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {

        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo valor: "));

    String[] operacoes = {"+", "-", "*", "/"};
        JComboBox<String> comboBox = new JComboBox<>(operacoes);
        JOptionPane.showMessageDialog(null, comboBox, "Escolha a operação: ", JOptionPane.INFORMATION_MESSAGE);


    String operacao = (String) comboBox.getSelectedItem();
    float resultado = 0;

    switch (operacao) {
        case "+":
            resultado = num1 + num2;
            break;
        case "-":
            resultado = num1 - num2;
            break;
        case "*":
            resultado = num1 * num2;
            break;
        case "/":
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            break;
        default:
            JOptionPane.showMessageDialog(null, "Essa operação é inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

