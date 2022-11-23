public class Cachorro extends Animais {
    public Cachorro(String nome, double peso, String raca) {

        super(nome, peso);
        this.raca =raca;
    }

    public String raca;

    public String getRaca() {

        return raca;
    }

    public void setRaca(String raca) {

        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                '}';
    }
}
