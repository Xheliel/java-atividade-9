public class Main {

    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro("Duke", 4, "Pit Monster");

        System.out.println(dog);
        dog.latir();

        Gato cat = new Gato("Tom", 4, "Cinza");

        System.out.println(cat);
        cat.miar();

    }
}