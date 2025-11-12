//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MatDeConstrucao {

        private String nomeFerramenta;
        private double preco;
        private int estoque;

        public MatDeConstrucao(String nomeFerramenta, double preco, int estoque) {
            this.nomeFerramenta = nomeFerramenta;
            this.preco = preco;
            this.estoque = estoque;
        }

        public void adicionarEstoque(int quantidade) {
            estoque += quantidade;
        }

        public void vender(int quantidade) {
            if (quantidade <= estoque) {
                estoque -= quantidade;
                System.out.println(quantidade + "unidades vendidas ");
            }else{
                System.out.println("Estoque insuficiente!!");
            }
        }

        public void aplicarPromocao(double porcentagem) {
            if (porcentagem > 0 && porcentagem < 100) {
                preco -= preco * (porcentagem / 100);
                System.out.println("Promoção aplicada! ");
            }else{
                System.out.println("Porcentagem inválida! ");
            }
        }

        public String getNomeFerramenta() {
            return nomeFerramenta;
        }

        public double getPreco() {
            return preco;
        }

        public int getEstoque() {
            return estoque;
        }

}