import java.util.List;
import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función cantidad
        Function<List<?>, Integer> cantidad = List::size;

        // Probar la función cantidad con una lista de enteros
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        int intCount = cantidad.apply(intList);
        System.out.println("Cantidad de enteros: " + intCount); // Salida: 5

        // Probar la función cantidad con una lista de cadenas
        List<String> stringList = List.of("a", "b", "c");
        int stringCount = cantidad.apply(stringList);
        System.out.println("Cantidad de cadenas: " + stringCount); // Salida: 3
    }
}
