import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class cadenas {

    public static void eliminarPorLetraOLongitud(ArrayList<String> lista, char letra, int n) {
        if (lista == null) {
            return;
        }

        lista.removeIf(cadena -> cadena == null || cadena.startsWith(String.valueOf(letra)) || cadena.length() < n);
    }

    public static ArrayList<String> convertirAMayusculas(ArrayList<String> lista) {
        if (lista == null) {
            return new ArrayList<>();
        }

        return lista.stream()
                .filter(palabra -> palabra != null)
                .map(palabra -> palabra.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashMap<String, Integer> mapearPalabraALongitud(ArrayList<String> lista) {
        if (lista == null) {
            return new HashMap<>();
        }

        return lista.stream()
                .filter(palabra -> palabra != null)
                .collect(Collectors.toMap(
                        palabra -> palabra,
                        palabra -> palabra.length(),
                        (anterior, nuevo) -> anterior,
                        HashMap::new
                ));
    }

    public static HashMap<String, Integer> contarFrecuencias(ArrayList<String> lista) {
        HashMap<String, Integer> resultado = new HashMap<>();

        if (lista == null) {
            return resultado;
        }

        for (String palabra : lista) {
            if (palabra == null) {
                continue;
            }
            resultado.merge(palabra, 1, (viejo, nuevo) -> viejo + nuevo);
        }

        return resultado;
    }

    public static ArrayList<String> filtrarPorFrecuenciaMenor(HashMap<String, Integer> frecuencias, int limite) {
        if (frecuencias == null) {
            return new ArrayList<>();
        }

        return frecuencias.entrySet().stream()
                .filter(entrada -> entrada.getValue() != null && entrada.getValue() < limite)
                .map(entrada -> entrada.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static HashSet<String> deduplicarPalabras(String frase, int n) {
        if (frase == null) {
            return new HashSet<>();
        }

        String[] palabras = frase.split(" ");

        return Arrays.stream(palabras)
                .filter(palabra -> !palabra.isEmpty() && palabra.length() >= n)
                .map(palabra -> palabra.toLowerCase())
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void limitarFrecuencias(HashMap<String, Integer> frecuencias, int n) {
        if (frecuencias == null) {
            return;
        }

        frecuencias.replaceAll((palabra, frecuencia) ->
                frecuencia == null ? null : (frecuencia > n ? n : frecuencia));
    }

}