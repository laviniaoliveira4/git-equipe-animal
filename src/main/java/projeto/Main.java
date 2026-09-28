package projeto;

import projeto.modelo.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bicho", 3);
        System.out.println(animal);
        animal.emitirSom();
    }
}