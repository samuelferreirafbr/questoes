import java.util.Scanner;

// Questão 14

public class Login{
    public String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean autenticacao(String nome, String senha1) {
        return this.usuario.equals(nome) && this.senha.equals (senha1);
    }

    public void trocarSenha(String senhaNova) {
        this.senha = senhaNova;
        System.out.println("Senha redefinida!");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Crie um usuário:");
        String usuarioInicial = scanner.nextLine();
        System.out.println("Crie uma senha:");
        String senhaInicial = scanner.nextLine();

        Login login = new Login(usuarioInicial, senhaInicial);

        System.out.println("Login:");
        System.out.println("Digite o usuário:");
        String usuarioDigitado = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senhaDigitada = scanner.nextLine();

        if (login.autenticacao(usuarioDigitado, senhaDigitada)) {
            System.out.println("Login bem-sucedido!");


            System.out.println("Deseja redefinir a senha? (sim/nao)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Digite a nova senha:");
                String novaSenha = scanner.nextLine();
                login.trocarSenha(novaSenha);
            }

        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        scanner.close();
    }
}