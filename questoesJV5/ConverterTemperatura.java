import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ConverterTemperatura {
    public static void main(String args[]){
        String[] opcoes = {"Celsius para Fahrenheit", "Fahrenheit para Celsius"};

        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        JOptionPane.showMessageDialog(null, comboBox, "Escolha o tipo de conversão", JOptionPane.QUESTION_MESSAGE);
        String temperatura = (String) comboBox.getSelectedItem();

        float temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a Temperatura: "));

        float resultado = 0;

        switch (temperatura) {
            case "Celsius para Fahrenheit":
                resultado = (temp * 9/5) + 32;
                break;
            case "Fahrenheit para Celsius":
                resultado = (temp - 32) * 5/9;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro na conversão!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }

        // Exibir resultado
        JOptionPane.showMessageDialog(null, "Temperatura convertida: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
