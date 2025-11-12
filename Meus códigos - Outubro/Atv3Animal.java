public abstract class Atv3Animal {
    private String especie;
    private double peso;

    public Atv3Animal (String especie, double peso) {
        super();
        this.especie = especie;
        this.peso = peso;
    }

    public abstract String emitirSom();


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
