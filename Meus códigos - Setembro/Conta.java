
public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta (String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void Sacar (double dinheiro) {
        if (dinheiro > 0 && saldo >= dinheiro) {
            saldo -= dinheiro;
            System.out.println("Saque de R$: " + dinheiro + " realizado com sucesso. ");
        }else{
            System.out.println("Saldo insuficiente para realizar o saque, ou valor inválido ");
        }
    }

    public void Depositar (double dinheiro) {
        if (dinheiro > 0 ) {
            saldo += dinheiro;
            System.out.println("Depósito no valor de: " + dinheiro + " foi realizado com sucesso! ");
        }else{
            System.out.println("Valor inválido ou indisponível para depósito ");
        }


    }

    public void Transferir (Conta destino, double dinheiro) {
        if (dinheiro > 0 && saldo >= dinheiro) {
            saldo -= dinheiro;
            destino.saldo += dinheiro;
            System.out.println("Transferencia no valor " + dinheiro + " foi realizado com sucesso! ");
        }else{
            System.out.println("Saldo insuficiente para a transferencia! ");
        }
    }

    public double simularInvestimento (double valor, int meses) {
        if (valor > 0 && meses > 0) {
            double taxa = 0.01;
            double montante = valor * Math.pow((1 + taxa), meses);
            return montante;
        }else{
            System.out.println("Valores inválidos para simular o investimento! ");
            return 0;
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }




}