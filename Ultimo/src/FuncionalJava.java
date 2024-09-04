import java.util.List;
import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función ultimo
        Function<List<?>, Object> ultimo = list -> {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Lista vacía");
            } else {
                return list.get(list.size() - 1);
            }
        };

        // Probar la función ultimo con una lista de enteros
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        int ultimoInt = (Integer) ultimo.apply(intList);
        System.out.println("Último entero: " + ultimoInt); // Salida: 5

        // Probar la función ultimo con una lista de cadenas
        List<String> stringList = List.of("a", "b", "c");
        String ultimoString = (String) ultimo.apply(stringList);
        System.out.println("Última cadena: " + ultimoString); // Salida: c
    }
}
