public class Peixe extends Animais {
    public Peixe(String nome, double peso) {
        super(nome, peso);
    }
    public String Habitat;
    public String getHabitat() {
        return Habitat;
    }
    public void setHabitat(String habitat) {
        Habitat = habitat;
    }
}