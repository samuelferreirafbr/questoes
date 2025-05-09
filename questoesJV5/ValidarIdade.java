import javax.swing. JOptionPane;

public class ValidarIdade {
    public static void main(String[] args) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            // Valida a idade
            if (idade >= 18) {
                JOptionPane.showMessageDialog(null, "Você é maior de idade! " + idade + " anos!");
            }
        else {
                JOptionPane.showMessageDialog(null, "Você é menor de idade! " + idade + " anos!");
        }
    }
}
