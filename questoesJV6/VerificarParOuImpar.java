import javax.swing.JOptionPane;

public class VerificadorParOuImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, " O Número " + numero + " é par. ");
        } else {
            JOptionPane.showMessageDialog(null, " O Número " + numero + " é impar. " );
        }
    }
}
