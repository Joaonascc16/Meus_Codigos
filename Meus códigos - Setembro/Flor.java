public class Flor {

    private String nomeFLor;
    private double preco;
    private String nomeCliente;
    private boolean presente;

    public Flor (String nomeFlor, double preco, String nomeCliente, boolean presente) {
        this.nomeFLor = nomeFlor;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
        this.presente = presente;
    }

    public String getNomeFLor(){return nomeFLor; }
    public double getPreco(){return preco; }
    public String getNomeCliente(){return nomeCliente; }
    public boolean getPresente(){return presente; }

    @Override
    public String toString() {
        return "Flor {nome = "+ nomeFLor +
                ", preço = "+ preco +
                ", cliente = "+ nomeCliente +
                ", presente = "+ presente + "}";
    }

}
