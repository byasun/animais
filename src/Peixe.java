public class Peixe extends Animais {
    public Peixe(String nome, double peso, String Habitat) {
        super(nome, peso);
        this.Habitat = Habitat;
    }

    public String Habitat;

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "Habitat='" + Habitat + '\'' +
                '}';
    }
}