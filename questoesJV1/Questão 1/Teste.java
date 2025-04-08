class Animal {
        public void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

    class Cachorro extends Animal {
        @Override
        public void fazerSom() {
        System.out.println("Cachorro latindo");
    }
}

    public class Teste {
        public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerSom();
    }
}