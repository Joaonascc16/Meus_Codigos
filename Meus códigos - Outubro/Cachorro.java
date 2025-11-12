public class Cachorro extends Atv3Animal {
    private String raca;

    public Cachorro (String especie, double peso, String raca) {
        super(especie, peso);
        this.raca = raca;
    }
    @Override
    public String emitirSom() {
        return "Au, au!";
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
