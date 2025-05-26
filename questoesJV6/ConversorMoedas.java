import javax.swing.JOptionPane;

public class ConversorMoedas {
    public static void main(String[] args) {
        String[] opcoes = {"Reais para Dólares", "Dólares para Reais"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha a conversão:",
                "Conversor de Moedas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opcoes, opcoes[0]);

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
        double resultado;
        String mensagem;

        if (escolha == 0) { // Reais para Dólares
            resultado = valor / 5.0;
            mensagem = "Valor em Dólares: " + String.format("%.2f", resultado);
        } else { // Dólares para Reais
            resultado = valor * 5.0;
            mensagem = "Valor em Reais: " + String.format("%.2f", resultado);
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}