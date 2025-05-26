import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args) {
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota:"));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota:"));

        float media = (nota1 + nota2 + nota3) / 3;

        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: " + resultado);
    }
}