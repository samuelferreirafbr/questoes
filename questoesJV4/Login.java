public class Login {
    private String usuario;
    private String senha;

    public Login(String _usuario, String _senha) {
        this.usuario = _usuario;
        this.senha = _senha;
    }

    public void setSenha(String _senha) {
        if (_senha != null && !_senha.isEmpty()) {
            this.senha = _senha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Erro: A senha não pode ser nula ou vazia.");
        }
    }

    public boolean fazerLogin(String _usuario, String _senha) {
        try {
            if (!this.usuario.equals(_usuario)) {
                throw new LoginException("Erro: Usuário incorreto.");
            }
            if (!this.senha.equals(_senha)) {
                throw new LoginException("Erro: Senha incorreta.");
            }
            System.out.println("Login bem-sucedido! Bem-vindo, " + _usuario + ".");
            return true;
        } catch (LoginException e) {

            System.out.println(e.getMessage());
            return false;
        }
    }

    public static class LoginException extends Exception {
        public LoginException(String mensagem) {
            super(mensagem);
        }
    }

    public static void main(String[] args) {
        Login login = new Login("usuarioTeste", "senha123");

        login.fazerLogin("usuarioTeste", "senha123");

        login.fazerLogin("usuarioTeste", "senhaErrada");

        login.fazerLogin("usuarioErrado", "senha123");
    }
}
