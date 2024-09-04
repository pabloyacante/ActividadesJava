import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Boolean> divisor = new BiFunction<Integer, Integer, Boolean>() {
            @Override
            public Boolean apply(Integer a, Integer b) {
                if (b == 0) {
                    return false;
                } else if (a == b) {
                    return true;
                } else if (a < b) {
                    return this.apply(a, b - a);
                } else {
                    return false;
                }
            }
        };

        boolean resultado1 = divisor.apply(3, 21);
        boolean resultado2 = divisor.apply(4, 16);
        boolean resultado3 = divisor.apply(4, 21);
        System.out.println(resultado1); // Salida: true
        System.out.println(resultado2); // Salida: false
        System.out.println(resultado3);
    }
}
