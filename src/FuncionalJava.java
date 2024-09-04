//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionalJava {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        java.util.function.Function<Integer, Integer> duplicar = x -> x * 2;

        List<Integer> numerosDuplicados = numeros.stream()
                                                 .map(duplicar)
                .collect(Collectors.toList());
        System.out.println(numerosDuplicados);
    }
}