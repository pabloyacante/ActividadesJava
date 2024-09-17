import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncionalJava {
    
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Crear una función que usa el divisor fijo
        int divisor = 12;
        Function<Integer, Integer> mcdConDivisor = n -> mcd(n, divisor);

        // Aplicar la función mcd parcialmente a una lista utilizando map
        List<Integer> numeros = Arrays.asList(48, 18, 30, 12);

        List<Integer> resultados = numeros.stream()
                .map(mcdConDivisor)
                .collect(Collectors.toList());

        System.out.println("Resultados: " + resultados); // Salida: [12, 6, 6, 12]
    }
}
