package projeto.modelo;

public class Gato extends Animal {

    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " mia: Miau!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Cor do pelo: " + corPelo;
    }
}