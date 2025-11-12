import java.util.ArrayList;
import java.util.List;

public class Ex_02REO {
    public static void main(String[] args) {

        List<Flor> vendas = new ArrayList<>();
        vendas.add(new Flor("Rosa vermelha", 25.0, "Evillyn", true));
        vendas.add(new Flor("Girassol", 27.50, "João", false));
        vendas.add(new Flor("Tulipa",30.15, "Adelita", true));

        Flor maisCara = encontrarFlorMaisCara(vendas);
        if(maisCara != null) {
            System.out.println("A flor mais cara "+ maisCara);
        }else{
            System.out.println("A lista está vazia! ");
        }

        double receitaPresente = calcularPorTipo(vendas, true);
        double receitaNaoPresente = calcularPorTipo(vendas, false);

        System.out.println(String.format("Receita de flores compradas como presente = %.2f", receitaPresente));
        System.out.println(String.format("Receita de flores compradas sem ser presentes = %.2f", receitaNaoPresente));

        if (receitaPresente > receitaNaoPresente) {
            System.out.println("A loja teve maior receita vendendo as flores como presente! ");

        }else if (receitaNaoPresente > receitaPresente) {
            System.out.println("A loja teve maior receita vendendo as flores sem ser presente! ");
        }else {
            System.out.println("Ambas as receitas são iguais! ");
        }

    }

    public static Flor encontrarFlorMaisCara(List<Flor> lista) {
        if (lista == null || lista.isEmpty()) return null;
        Flor maisCara = lista.get(0);
        for (Flor f : lista) {
            if (f.getPreco() > maisCara.getPreco()) {
                maisCara = f;
            }
        }

        return maisCara;
    }

    public static double calcularPorTipo(List<Flor> lista, boolean presente) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double total = 0.0;
        for (Flor f : lista) {
            if (f.getPresente() == presente) {
                total += f.getPreco();
            }
        }

        return total;
    }
}
