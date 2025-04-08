class Animal {

    public void fazerSom(){
        System.out.println("O Animal faz um som");
    }
}

class Cachorro extends Animal{
    @Override
    public void fazerSom(){
        System.out.println("O cachorro faz: 'Au, au!' ");
    }
}

    class Gato extends Animal{
        @Override
        public void fazerSom(){
            System.out.println("O gato faz: 'Miau!' ");
        }

}

    public class SomAnimal {
        public static void main(String[] args) {

            Animal cachorro = new Cachorro();
            Animal gato = new Gato();
        
            cachorro.fazerSom();
            gato.fazerSom();
    }
}

