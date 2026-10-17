import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class numeros {

    public static void multiplicarElementos(ArrayList<Integer> lista, int factor) {
        if (lista == null) {
            return;
        }

        lista.replaceAll(n -> n == null ? null : n * factor);
    }

    public static HashSet<Integer> cuadradosDeParesUnicos(ArrayList<Integer> lista) {
        if (lista == null) {
            return new HashSet<>();
        }

        return new HashSet<>(
                lista.stream()
                        .filter(n -> n != null && n % 2 == 0 && Collections.frequency(lista, n) == 1)
                        .map(n -> n * n)
                        .collect(Collectors.toSet())
        );
    }

    public static void imprimirCatalogoConDescuento(HashMap<String, Double> productos) {
        if (productos == null || productos.isEmpty()) {
            System.out.println("Sin nada en el catalogo");
            return;
        }

        System.out.println("===== Catalogo con 10% de descuento =====");

        productos.forEach((nombre, precio) -> {
            if (precio == null) {
                System.out.printf("%-10s  Sin precio%n", nombre);
                return;
            }
            double precioFinal = precio - (precio * 0.10);
            System.out.printf("%-10s  Antes: $%.2f  Ahora: $%.2f%n", nombre, precio, precioFinal);
        });
    }
}