import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función parejas
        BiFunction<List<?>, List<?>, List<Object>> parejas = (list1, list2) -> {
            if (list1.size() != list2.size()) {
                throw new IllegalArgumentException("Las listas deben tener la misma longitud");
            }
            List<Object> result = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                result.add(new Pair<>(list1.get(i), list2.get(i)));
            }
            return result;
        };

        // Probar la función parejas con listas de enteros
        List<Integer> intList1 = List.of(1, 2, 3, 4, 5);
        List<Integer> intList2 = List.of(6, 7, 8, 9, 10);
        List<Object> resultIntList = parejas.apply(intList1, intList2);
        System.out.println("Lista de pares de enteros: " + resultIntList); // Salida: [(1, 6), (2, 7), (3, 8), (4, 9), (5, 10)]

        // Probar la función parejas con listas de cadenas
        List<String> stringList1 = List.of("a", "b", "c");
        List<String> stringList2 = List.of("x", "y", "z");
        List<Object> resultStringList = parejas.apply(stringList1, stringList2);
        System.out.println("Lista de pares de cadenas: " + resultStringList); // Salida: [(a, x), (b, y), (c, z)]
    }

    // Clase auxiliar para representar pares
    static class Pair<A, B> {
        private final A first;
        private final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
