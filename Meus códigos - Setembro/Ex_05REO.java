import Endereco.Endereco;

public class Ex_05REO {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco(
                "Brasil",
                "SC",
                "Blumenau",
                "89040-320",
                "Velha Central",
                341

        );

        Pessoa p1 = new Pessoa("João", endereco1);

        System.out.println(p1);


    }
}
