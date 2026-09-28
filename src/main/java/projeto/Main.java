package projeto;

import java.util.ArrayList;
import java.util.List;

import projeto.modelo.Animal;
import projeto.modelo.Gato;
import projeto.modelo.Pato;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Pato("Donald", 2, "lago"));
        animais.add(new Gato("Mingau", 4, "branco"));

        for (Animal animal : animais) {
            System.out.println(animal);
            animal.emitirSom();
            System.out.println();
        }
    }
}