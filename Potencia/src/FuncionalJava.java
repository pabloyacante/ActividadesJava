import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función potencia
        Function<Integer, Function<Integer, Integer>> potencia = base -> exponente -> (int) Math.pow(base, exponente);

        // Aplicar la función potencia parcialmente a una lista utilizando map
        List<Integer> bases = Arrays.asList(2, 3, 4);
        int exponente = 3;

        List<Integer> resultados = bases.stream()
                .map(potencia.apply(exponente))
                .collect(Collectors.toList());

        System.out.println("Resultados: " + resultados); // Salida: [8, 27, 64]
    }
}
