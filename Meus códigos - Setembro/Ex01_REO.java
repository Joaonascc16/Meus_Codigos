import java.util.ArrayList;

public class Ex01_REO {
    public static void main(String[] args) {

        ArrayList<Retangulo> lista = new ArrayList<>();

        lista.add(new Retangulo("R1", 5, 5));
        lista.add(new Retangulo("R2", 2, 9));
        lista.add(new Retangulo("R3", 4, 6));
        lista.add(new Retangulo("R4", 6, 7));

        Retangulo maiorArea = lista.get(0);
        for (Retangulo r : lista) {
            if (r.getArea() > maiorArea.getArea()) {
                maiorArea = r;
            }
        }

        Retangulo maiorPerimetro = lista.get(0);
        for (Retangulo r : lista) {
            if (r.getPerimetro() > maiorPerimetro.getPerimetro()) {
                maiorPerimetro = r;
            }
        }

        System.out.println("Retangulo com maior área: ");
        System.out.println(maiorArea);

        System.out.println("\n Retangulo com maior perimetro: ");
        System.out.println(maiorPerimetro);


    }
}
