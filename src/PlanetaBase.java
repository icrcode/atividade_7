abstract class PlanetaBase {
    private final String nome;
    private final double fatorGravidade;

    public PlanetaBase(String nome, double fatorGravidade) {
        this.nome = nome;
        this.fatorGravidade = fatorGravidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso(double pesoNaTerra) {
        return pesoNaTerra * fatorGravidade;
    }
}