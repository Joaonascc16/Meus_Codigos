public class Circulo {

    private String cor;
    private double raio;

    public Circulo (String cor, double raio) {
        setCor(cor);
        setRaio(raio);

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor == null || cor.isBlank()) {
            throw new IllegalArgumentException("Cor Inválida!");
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0) {
            throw new IllegalArgumentException("Raio Inválido!");
        }
    }

    public double CalcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }


}
