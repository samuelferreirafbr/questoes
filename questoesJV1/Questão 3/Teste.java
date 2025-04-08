interface Animal {
    void fazerSom();
}

interface Domestico {
    void brincar();
}

class Cachorro implements Animal, Domestico {
    public void fazerSom(){
        System.out.println("Cachorro latindo");
    }

    public void brincar() {
        System.out.println("Cachorro brincando");
    }

}

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.brincar();
    }
}
