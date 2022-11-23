public class Animais {
    public String nome;
    public double peso;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public Animais(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animais{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}