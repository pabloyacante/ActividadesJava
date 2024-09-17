import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función rotarIzq
        BiFunction<Integer, List<?>, List<?>> rotarIzq = new BiFunction<Integer, List<?>, List<?>>() {
            @Override
            public List<?> apply(Integer n, List<?> list) {
                if (list.isEmpty()) {
                    return new ArrayList<>();
                } else {
                    int size = list.size();
                    n = n % size; // Normalizar n para evitar rotaciones innecesarias
                    if (n < 0) {
                        n = size + n; // Convertir rotaciones negativas a positivas
                    }
                    List<Object> rotated = new ArrayList<>();
                    rotated.addAll(list.subList(n, size)); // Agregar parte desde n al final
                    rotated.addAll(list.subList(0, n));    // Agregar parte desde 0 hasta n
                    return rotated;
                }
            }
        };

        // Probar la función rotarIzq con una lista de enteros (convertida a ArrayList)
        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<?> resultIntList = rotarIzq.apply(2, intList);
        System.out.println("Lista rotada 2 posiciones a la izquierda: " + resultIntList); // Salida: [3, 4, 5, 1, 2]

        // Probar la función rotarIzq con una lista de cadenas (convertida a ArrayList)
        List<String> stringList = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
        List<?> resultStringList = rotarIzq.apply(3, stringList);
        System.out.println("Lista rotada 3 posiciones a la izquierda: " + resultStringList); // Salida: [d, e, a, b, c]
    }
}
