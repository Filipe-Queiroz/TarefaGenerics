import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<CarrosHonda> carros = new ArrayList<>();
        carros.add(new Accord());
        carros.add(new Civic());
        carros.add(new NSX());
        carros.add(new S2000());

        imprimirCarros(carros);
    }

    public static void imprimirCarros(List<? extends CarrosHonda> lista) {
        for (CarrosHonda carro : lista) {
            System.out.println("***************************");
            carro.exibeCarro();
        }
    }
}