public class Cachorro extends Animais{
    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }
    public String raca;
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
