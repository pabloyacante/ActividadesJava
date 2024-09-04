
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionalJava {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(2, 3, 6, 14, 45);

        java.util.function.Function<Integer, Integer> duplicar = x -> x * 2;

        List<Integer> numerosDuplicados = numeros.stream()
                                                 .map(duplicar)
                .collect(Collectors.toList());
        System.out.println(numerosDuplicados);
    }
}