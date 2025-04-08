public class ParOuImpar {
    public int numero;

    public void parImpar() {
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    public static void main(String args[]) {
        ParOuImpar pi = new ParOuImpar();
        pi.numero = 7;
        pi.parImpar();
    }


}
