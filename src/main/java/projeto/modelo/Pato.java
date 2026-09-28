package projeto.modelo;

public class Pato extends Animal {

     private String habitat;

    public Pato(String nome, int idade, String habitat) {
        super(nome, idade);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " grasna: Quack quack!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Habitat: " + habitat;
    }
}