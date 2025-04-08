public class Pessoa{
    private String nome;
    private int idade;

public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    }

public String getNome() {
    return nome;
    }

public int geIdade() {
    return idade;
    }

public void SetNome(String nome) {
    this.nome = nome;
    }

public void SetIdade(int idade) {
    this.idade = idade;
    }
}