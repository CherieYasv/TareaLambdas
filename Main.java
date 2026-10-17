import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        probarMultiplicarElementos();
        probarCuadradosDeParesUnicos();
        probarImprimirCatalogoConDescuento();
        probarEliminarPorLetraOLongitud();
        probarConvertirAMayusculas();
        probarMapearPalabraALongitud();
        probarContarFrecuencias();
        probarFiltrarPorFrecuenciaMenor();
        probarDeduplicarPalabras();
        probarLimitarFrecuencias(); 
    }

    // 1) multiplicarElementos
    private static void probarMultiplicarElementos() {
        System.out.println("\n=== multiplicarElementos ===");

        System.out.println("\nNormal");
        ArrayList<Integer> normal = new ArrayList<>();
        normal.add(3);
        normal.add(9);
        normal.add(12);
        System.out.println("Antes:   " + normal);
        numeros.multiplicarElementos(normal, 3);
        System.out.println("Después: " + normal);

        System.out.println("\nCon 0");
        ArrayList<Integer> cero = new ArrayList<>();
        cero.add(5);
        cero.add(10);
        System.out.println("Antes:   " + cero);
        numeros.multiplicarElementos(cero, 0);
        System.out.println("Después: " + cero);

        System.out.println("\nCon negativos");
        ArrayList<Integer> negativos = new ArrayList<>();
        negativos.add(1);
        negativos.add(-2);
        negativos.add(0);
        System.out.println("Antes:   " + negativos);
        numeros.multiplicarElementos(negativos, -2);
        System.out.println("Después: " + negativos);

        System.out.println("\nCon lista vacía");
        ArrayList<Integer> vacia = new ArrayList<>();
        System.out.println("Antes:   " + vacia);
        numeros.multiplicarElementos(vacia, 4);
        System.out.println("Después: " + vacia);

        System.out.println("\nCon un null");
        ArrayList<Integer> conNull = new ArrayList<>();
        conNull.add(4);
        conNull.add(null);
        conNull.add(6);
        System.out.println("Antes:   " + conNull);
        numeros.multiplicarElementos(conNull, 2);
        System.out.println("Después: " + conNull);

        System.out.println("\nCon lista null");
        System.out.println("Antes:   null");
        numeros.multiplicarElementos(null, 5);
        System.out.println("Después: no hizo nada y no lanzó error");
    }

    // 2) cuadradosDeParesUnicos
    private static void probarCuadradosDeParesUnicos() {
        System.out.println("\n=== cuadradosDeParesUnicos ===");

        System.out.println("\nNormal");
        ArrayList<Integer> normal = new ArrayList<>();
        normal.add(1);
        normal.add(2);
        normal.add(2);
        normal.add(3);
        normal.add(4);
        normal.add(4);
        normal.add(5);
        normal.add(6);
        normal.add(8);
        normal.add(8);
        normal.add(10);
        System.out.println("Entrada:   " + normal);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(normal));
        System.out.println("Original después: " + normal);

        System.out.println("\nSolo impares");
        ArrayList<Integer> impares = new ArrayList<>();
        impares.add(1);
        impares.add(3);
        impares.add(5);
        System.out.println("Entrada:   " + impares);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(impares));

        System.out.println("\nPares repetidos");
        ArrayList<Integer> repetidos = new ArrayList<>();
        repetidos.add(2);
        repetidos.add(2);
        repetidos.add(4);
        repetidos.add(4);
        System.out.println("Entrada:   " + repetidos);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(repetidos));

        System.out.println("\nCon 0 y negativos");
        ArrayList<Integer> especiales = new ArrayList<>();
        especiales.add(0);
        especiales.add(-2);
        especiales.add(3);
        System.out.println("Entrada:   " + especiales);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(especiales));

        System.out.println("\nCon lista vacía");
        ArrayList<Integer> vacia = new ArrayList<>();
        System.out.println("Entrada:   " + vacia);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(vacia));

        System.out.println("\nCon nulls");
        ArrayList<Integer> conNull = new ArrayList<>();
        conNull.add(null);
        conNull.add(2);
        conNull.add(null);
        conNull.add(4);
        System.out.println("Entrada:   " + conNull);
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(conNull));

        System.out.println("\nCon lista null");
        System.out.println("Entrada:   null");
        System.out.println("Resultado: " + numeros.cuadradosDeParesUnicos(null));
    }

    // 3) imprimirCatalogoConDescuento
    private static void probarImprimirCatalogoConDescuento() {
        System.out.println("\n##### imprimirCatalogoConDescuento #####");

        System.out.println("\nNormal");
        HashMap<String, Double> normal = new HashMap<>();
        normal.put("Laptop", 15000.0);
        normal.put("Mouse", 250.0);
        normal.put("Teclado", 800.0);
        normal.put("Monitor", 3200.0);
        System.out.println("Catalogo original: " + normal);
        numeros.imprimirCatalogoConDescuento(normal);
        System.out.println("Catalogo después: " + normal);

        System.out.println("\nCon precio 0");
        HashMap<String, Double> gratis = new HashMap<>();
        gratis.put("Folleto", 0.0);
        gratis.put("Cable", 99.99);
        numeros.imprimirCatalogoConDescuento(gratis);

        System.out.println("\nCon precio null");
        HashMap<String, Double> sinPrecio = new HashMap<>();
        sinPrecio.put("Audifonos", null);
        sinPrecio.put("Mouse", 250.0);
        numeros.imprimirCatalogoConDescuento(sinPrecio);

        System.out.println("\nCon mapa vacío");
        HashMap<String, Double> vacio = new HashMap<>();
        numeros.imprimirCatalogoConDescuento(vacio);

        System.out.println("\nCon mapa null");
        numeros.imprimirCatalogoConDescuento(null);
    }

    // 4) eliminarPorLetraOLongitud
    private static void probarEliminarPorLetraOLongitud() {
        System.out.println("\n##### eliminarPorLetraOLongitud #####");

        System.out.println("\nNormal");
        ArrayList<String> normal = new ArrayList<>();
        normal.add("ciervo");
        normal.add("gatuno");
        normal.add("castor");
        normal.add("mantarralla");
        normal.add("martn");
        normal.add("taso");
        normal.add("manopla");
        System.out.println("Antes:   " + normal);
        cadenas.eliminarPorLetraOLongitud(normal, 'm', 5);
        System.out.println("Después: " + normal);

        System.out.println("\nNinguna cumple");
        ArrayList<String> ninguna = new ArrayList<>();
        ninguna.add("hola");
        ninguna.add("mundo");
        System.out.println("Antes:   " + ninguna);
        cadenas.eliminarPorLetraOLongitud(ninguna, 'z', 1);
        System.out.println("Después: " + ninguna);

        System.out.println("\nTodas se eliminan");
        ArrayList<String> todas = new ArrayList<>();
        todas.add("ferrocarril");
        todas.add("dwarf");
        todas.add("avioneto");
        System.out.println("Antes:   " + todas);
        cadenas.eliminarPorLetraOLongitud(todas, 'a', 3);
        System.out.println("Después: " + todas);

        System.out.println("\nCon mayúsculas");
        ArrayList<String> mayusculas = new ArrayList<>();
        mayusculas.add("Manzano");
        mayusculas.add("mangoneada");
        System.out.println("Antes:   " + mayusculas);
        cadenas.eliminarPorLetraOLongitud(mayusculas, 'm', 5);
        System.out.println("Después: " + mayusculas);

        System.out.println("\nCon vacía y null");
        ArrayList<String> raras = new ArrayList<>();
        raras.add("");
        raras.add(null);
        raras.add("hola");
        System.out.println("Antes:   " + raras);
        cadenas.eliminarPorLetraOLongitud(raras, 'x', 2);
        System.out.println("Después: " + raras);

        System.out.println("\nCon lista vacía");
        ArrayList<String> vacia = new ArrayList<>();
        System.out.println("Antes:   " + vacia);
        cadenas.eliminarPorLetraOLongitud(vacia, 'a', 3);
        System.out.println("Después: " + vacia);

        System.out.println("\nCon lista null");
        System.out.println("Antes:   null");
        cadenas.eliminarPorLetraOLongitud(null, 'a', 3);
        System.out.println("Después: no hizo nada y no lanzó error");
    }

    // 5) convertirAMayusculas
    private static void probarConvertirAMayusculas() {
        System.out.println("\n##### convertirAMayusculas #####");

        System.out.println("\nNormal");
        ArrayList<String> normal = new ArrayList<>();
        normal.add("javier");
        normal.add("elrubiusomg");
        normal.add("projectzomboid");
        normal.add("soyelmapa");
        System.out.println("Entrada:   " + normal);
        System.out.println("Resultado: " + cadenas.convertirAMayusculas(normal));
        System.out.println("Original después: " + normal);

        System.out.println("\nYa en mayúsculas");
        ArrayList<String> yaMayus = new ArrayList<>();
        yaMayus.add("HOLA");
        yaMayus.add("MUNDOTE");
        System.out.println("Entrada:   " + yaMayus);
        System.out.println("Resultado: " + cadenas.convertirAMayusculas(yaMayus));

        System.out.println("\nCon vacía y null");
        ArrayList<String> raras = new ArrayList<>();
        raras.add("java");
        raras.add(null);
        raras.add("");
        raras.add("Pruebocosas");
        System.out.println("Entrada:   " + raras);
        System.out.println("Resultado: " + cadenas.convertirAMayusculas(raras));

        System.out.println("\nCon lista vacía");
        ArrayList<String> vacia = new ArrayList<>();
        System.out.println("Entrada:   " + vacia);
        System.out.println("Resultado: " + cadenas.convertirAMayusculas(vacia));

        System.out.println("\nCon lista null");
        System.out.println("Entrada:   null");
        System.out.println("Resultado: " + cadenas.convertirAMayusculas(null));
    }

    // 6) mapearPalabraALongitud
    private static void probarMapearPalabraALongitud() {
        System.out.println("\n##### mapearPalabraALongitud #####");

        System.out.println("\nNormal");
        ArrayList<String> normal = new ArrayList<>();
        normal.add("javier");
        normal.add("dwarf");
        normal.add("papa");
        normal.add("nose");
        normal.add("nariz");
        System.out.println("Entrada:   " + normal);
        System.out.println("Resultado: " + cadenas.mapearPalabraALongitud(normal));

        System.out.println("\nCon vacía y null");
        ArrayList<String> raras = new ArrayList<>();
        raras.add("");
        raras.add(null);
        raras.add("a");
        System.out.println("Entrada:   " + raras);
        System.out.println("Resultado: " + cadenas.mapearPalabraALongitud(raras));

        System.out.println("\nCon lista vacía");
        ArrayList<String> vacia = new ArrayList<>();
        System.out.println("Entrada:   " + vacia);
        System.out.println("Resultado: " + cadenas.mapearPalabraALongitud(vacia));

        System.out.println("\nCon lista null");
        System.out.println("Entrada:   null");
        System.out.println("Resultado: " + cadenas.mapearPalabraALongitud(null));
    }

    // 7) contarFrecuencias
    private static void probarContarFrecuencias() {
        System.out.println("\n##### contarFrecuencias #####");

        System.out.println("\nNormal");
        ArrayList<String> normal = new ArrayList<>();
        normal.add("javier");
        normal.add("cristian");
        normal.add("javier");
        normal.add("lambda");
        normal.add("cristian");
        normal.add("javier");
        System.out.println("Entrada:   " + normal);
        System.out.println("Resultado: " + cadenas.contarFrecuencias(normal));

        System.out.println("\nTodas iguales");
        ArrayList<String> iguales = new ArrayList<>();
        iguales.add("hola");
        iguales.add("hola");
        iguales.add("hola");
        System.out.println("Entrada:   " + iguales);
        System.out.println("Resultado: " + cadenas.contarFrecuencias(iguales));

        System.out.println("\nSin repetidas");
        ArrayList<String> unicas = new ArrayList<>();
        unicas.add("uno");
        unicas.add("dos");
        unicas.add("cuatro");
        System.out.println("Entrada:   " + unicas);
        System.out.println("Resultado: " + cadenas.contarFrecuencias(unicas));

        System.out.println("\nCon vacías y null");
        ArrayList<String> raras = new ArrayList<>();
        raras.add("");
        raras.add(null);
        raras.add("");
        raras.add("a");
        System.out.println("Entrada:   " + raras);
        System.out.println("Resultado: " + cadenas.contarFrecuencias(raras));

        System.out.println("\nCon lista vacía");
        ArrayList<String> vacia = new ArrayList<>();
        System.out.println("Entrada:   " + vacia);
        System.out.println("Resultado: " + cadenas.contarFrecuencias(vacia));

        System.out.println("\nCon lista null");
        System.out.println("Entrada:   null");
        System.out.println("Resultado: " + cadenas.contarFrecuencias(null));
    }

    // 8) filtrarPorFrecuenciaMenor
    private static void probarFiltrarPorFrecuenciaMenor() {
        System.out.println("\n##### filtrarPorFrecuenciaMenor #####");

        HashMap<String, Integer> frecuencias = new HashMap<>();
        frecuencias.put("javier", 3);
        frecuencias.put("cristian", 2);
        frecuencias.put("omg", 1);
        frecuencias.put("tonoto", 5);
        frecuencias.put("soyelmapa", 1);

        System.out.println("\nNormal");
        System.out.println("Mapa:      " + frecuencias);
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(frecuencias, 3));

        System.out.println("\nCon límite 0");
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(frecuencias, 0));

        System.out.println("\nCon límite 100");
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(frecuencias, 100));

        System.out.println("\nCon frecuencia null");
        HashMap<String, Integer> conNull = new HashMap<>();
        conNull.put("hola", null);
        conNull.put("adios", 1);
        System.out.println("Mapa:      " + conNull);
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(conNull, 3));

        System.out.println("\nCon mapa vacío");
        HashMap<String, Integer> vacio = new HashMap<>();
        System.out.println("Mapa:      " + vacio);
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(vacio, 3));

        System.out.println("\nCon mapa null");
        System.out.println("Mapa:      null");
        System.out.println("Resultado: " + cadenas.filtrarPorFrecuenciaMenor(null, 3));

        System.out.println("\nMapa original después: " + frecuencias);
    }

    // 9) deduplicarPalabras
    private static void probarDeduplicarPalabras() {
        System.out.println("\n##### deduplicarPalabras #####");
        String frase = "Anita lava la tina Anita lava el protoboard";

        System.out.println("\nNormal");
        System.out.println("Frase:     \"" + frase + "\"");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(frase, 3));

        System.out.println("\nCon n = 50");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(frase, 50));

        System.out.println("\nCon n = 0");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(frase, 0));

        String conEspacios = "   hola    HOLA   mundo   ";
        System.out.println("\nCon espacios y mayúsculas");
        System.out.println("Frase:     \"" + conEspacios + "\"");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(conEspacios, 1));

        String conComa = "hola, hola";
        System.out.println("\nCon puntuación");
        System.out.println("Frase:     \"" + conComa + "\"");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(conComa, 1));

        System.out.println("\nCon frase vacía");
        System.out.println("Frase:     \"\"");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras("", 1));

        System.out.println("\nCon solo espacios");
        System.out.println("Frase:     \"     \"");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras("     ", 1));

        System.out.println("\nCon frase null");
        System.out.println("Frase:     null");
        System.out.println("Resultado: " + cadenas.deduplicarPalabras(null, 1));
    }

    // 10) limitarFrecuencias
    private static void probarLimitarFrecuencias() {
        System.out.println("\n##### limitarFrecuencias #####");

        System.out.println("\nNormal");
        HashMap<String, Integer> normal = new HashMap<>();
        normal.put("javier", 7);
        normal.put("hola", 2);
        normal.put("cristian", 3);
        normal.put("noches", 5);
        normal.put("mapa", 1);
        System.out.println("Antes:   " + normal);
        cadenas.limitarFrecuencias(normal, 3);
        System.out.println("Después: " + normal);

        System.out.println("\nCon límite 0");
        HashMap<String, Integer> cero = new HashMap<>();
        cero.put("java", 7);
        cero.put("c", 2);
        System.out.println("Antes:   " + cero);
        cadenas.limitarFrecuencias(cero, 0);
        System.out.println("Después: " + cero);

        System.out.println("\nCon límite 100");
        HashMap<String, Integer> grande = new HashMap<>();
        grande.put("java", 7);
        grande.put("c", 2);
        System.out.println("Antes:   " + grande);
        cadenas.limitarFrecuencias(grande, 100);
        System.out.println("Después: " + grande);

        System.out.println("\nCon frecuencia null");
        HashMap<String, Integer> conNull = new HashMap<>();
        conNull.put("hola", null);
        conNull.put("java", 7);
        System.out.println("Antes:   " + conNull);
        cadenas.limitarFrecuencias(conNull, 3);
        System.out.println("Después: " + conNull);

        System.out.println("\nCon mapa vacío");
        HashMap<String, Integer> vacio = new HashMap<>();
        System.out.println("Antes:   " + vacio);
        cadenas.limitarFrecuencias(vacio, 3);
        System.out.println("Después: " + vacio);

        System.out.println("\nCon mapa null");
        System.out.println("Antes:   null");
        cadenas.limitarFrecuencias(null, 3);
        System.out.println("Después: no hizo nada y no lanzó error");
    }
}