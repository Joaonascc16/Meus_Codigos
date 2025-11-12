public class Gato extends Atv3Animal{

    private boolean castrado;

    public Gato (String especie, double peso, boolean castrado) {
        super(especie, peso);
        this.castrado = castrado;
    }
    @Override
    public String emitirSom() {
        return "miau";
    }
    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
