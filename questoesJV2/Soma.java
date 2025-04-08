public class Soma {
    private int numero1 = 5;
    private int numero2 = 7;
    private int resultadoSoma;

    public void somarNumeros() {
        resultadoSoma = numero1 + numero2;
    }

    public void exibirSoma() {
        System.out.println("A soma será: " + resultadoSoma);
    }

    public static void main(String args[]) {
        Soma soma = new Soma();
        soma.somarNumeros();
        soma.exibirSoma();
    }

}
