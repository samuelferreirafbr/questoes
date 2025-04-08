// Superclasse

class Funcionario {
    private String nome;
    private double salarioBase;

// Construtor

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

// Metodo calcularSalario

    public double calcularSalario() {
        return salarioBase;
    }

}

// Gerente

class Gerente extends Funcionario {
    private double bonusSalario;


public Gerente(String nome, double salarioBase, double bonusSalario) {
    super(nome, salarioBase);
    this.bonusSalario = 50.00;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonusSalario;
    }

}

// Vendedor

    class Vendedor extends Funcionario {
        private double comissao;
    
    
public Vendedor(String nome, double salarioBase, double comissao) {
    super(nome, salarioBase);
    this.comissao = 35.00;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comissao;
    }

}

// Tecnico

class Tecnico extends Funcionario {

public Tecnico(String nome, double salarioBase) {
super(nome, salarioBase);
}

@Override
public double calcularSalario() {
    return super.calcularSalario();
}

}

// Main

public class Main {
    public static void main(String[] args) {
        // Criando os funcionários
        Funcionario gerente = new Gerente("Maria", 5000.00, 50.00);
        Funcionario vendedor = new Vendedor("Jonas", 3000.00, 35.00);
        Funcionario tecnico = new Tecnico("Antonio", 4000.00);

        // Calculando e exibindo os salários
        System.out.println("Salário total do Gerente: R$" + gerente.calcularSalario());
        System.out.println("Salário total do Vendedor: R$" + vendedor.calcularSalario());
        System.out.println("Salário total do Técnico: R$" + tecnico.calcularSalario());
    }
}
