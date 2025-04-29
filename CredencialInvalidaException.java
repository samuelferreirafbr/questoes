/* Questão 17 - parte 1
foi necessário criar um novo arquivo para criar a exceção,
pois não era aceita no arquivo principal
*/


// Definição da exceção

public class CredencialInvalidaException extends Exception {
    public CredencialInvalidaException(String mensagem) {
        super(mensagem);
    }
}