public class GatoSelvagem extends Animal {
    private String pelagem;
    private String tipoManchas;

    public GatoSelvagem(String raca, String nomeId, String porte, String habitat, String pais, String pelagem, String tipoManchas) {
        super(raca, nomeId, porte, habitat, pais);
        this.pelagem = pelagem;
        this.tipoManchas = tipoManchas;

    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public String getTipoManchas() {
        return tipoManchas;
    }
}
