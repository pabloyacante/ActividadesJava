import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> mayor = (a, b) -> {
            if (a >= b) {
                return a;
            } else {
                return b;
            }
        };


        int resultado1 = mayor.apply(999, 235);
        int resultado2 = mayor.apply(333, 666);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
