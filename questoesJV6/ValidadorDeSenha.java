import javax.swing.JOptionPane;

public class ValidadorDeSenha {

    public static void main(String [] args) {
        
        String senhaCerta = "1234";
        String senha  = JOptionPane.showInputDialog("Digite a senha: ");
        if (senhaCerta.equals(senha)) {
            JOptionPane.showMessageDialog(null, "Senha correta!");
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
}
