public class Ex_04REO {
    public static void main(String[] args) {
        Conta c1 = new Conta("Joao", 13000);
        Conta c2 = new Conta("Evillyn", 12000);

        c1.Sacar(300);
        c1.Depositar(1000);
        c1.Transferir(c2, 450);

        double Investimento = c1.simularInvestimento(900, 10);
        System.out.println("Montante após 10 meses: R$ "+ Investimento);

    }
}
