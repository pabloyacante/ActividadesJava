import java.util.List;
import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función suma
        Function<List<? extends Number>, Double> suma = list -> {
            double sum = 0;
            for (Number number : list) {
                sum += number.doubleValue();
            }
            return sum;
        };

        // Probar la función suma con una lista de enteros
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        double intSum = suma.apply(intList);
        System.out.println("Suma de enteros: " + intSum); // Salida: 15.0

        // Probar la función suma con una lista de flotantes
        List<Float> floatList = List.of(1.5f, 2.5f, 3.5f, 4.5f, 5.5f);
        double floatSum = suma.apply(floatList);
        System.out.println("Suma de flotantes: " + floatSum); // Salida: 17.5
    }
}
