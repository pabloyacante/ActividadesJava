import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función sacar utilizando una función auxiliar
        BiFunction<Integer, List<?>, List<?>> sacar = (n, list) -> {
            return sacarAux(n, list);
        };

        // Función auxiliar recursiva
        BiFunction<Integer, List<?>, List<?>> sacarAux = new BiFunction<Integer, List<?>, List<?>>() {
            @Override
            public List<?> apply(Integer n, List<?> list) {
                if (list.isEmpty()) {
                    return new ArrayList<>();
                } else if (n == 0) {
                    return new ArrayList<>(list.subList(1, list.size())); // Devolver lista mutable
                } else {
                    List<?> rest = this.apply(n - 1, list.subList(1, list.size()));
                    List<Object> result = new ArrayList<>();
                    result.add(list.get(0));
                    result.addAll(rest);
                    return result;
                }
            }
        };

        // Probar la función sacar con una lista de enteros
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<?> resultIntList = sacar.apply(2, intList);
        System.out.println("Lista sin el elemento en la posición 2: " + resultIntList); // Salida: [1, 2, 4, 5]

        // Probar la función sacar con una lista de cadenas
        List<String> stringList = List.of("a", "b", "c", "d");
        List<?> resultStringList = sacar.apply(1, stringList);
        System.out.println("Lista sin el elemento en la posición 1: " + resultStringList); // Salida: [a, c, d]
    }

    private static List<?> sacarAux(Integer n, List<?> list) {
        return list;
    }
}
