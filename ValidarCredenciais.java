// Questão 17 - parte 2

import java.util.Scanner;

public class ValidarCredenciais {
    private String usuarioCad;
    private String senhaCad;

    public void registrarUsuario(String usuario, String senha) {
        this.usuarioCad = usuario;
        this.senhaCad = senha;
        System.out.println("Usuário e senha registrados com sucesso!");
    }

    public void validar(String usuario, String senha) throws CredencialInvalidaException {
        if (!usuario.equals(usuarioCad) || !senha.equals(senhaCad)) {
            throw new CredencialInvalidaException("Credenciais inválidas. Verificar usuário e senha.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidarCredenciais validador = new ValidarCredenciais();

        System.out.println("Registro de novo usuário:");

        System.out.print("Crie um nome de usuário: ");
        String usuarioCriado = scanner.nextLine();

        System.out.print("Crie uma senha: ");
        String senhaCriada = scanner.nextLine();

        validador.registrarUsuario(usuarioCriado, senhaCriada);

        System.out.println("\nFaça login com suas credenciais:");

        try {
            System.out.print("Usuário: ");
            String usuarioLogin = scanner.nextLine();

            System.out.print("Senha: ");
            String senhaLogin = scanner.nextLine();

            validador.validar(usuarioLogin, senhaLogin);
            System.out.println("Acesso autorizado!");
        } catch (CredencialInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
