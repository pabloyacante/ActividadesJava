import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> mcd = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                if (b == 0) {
                    return a;
                } else {
                    return this.apply(b, a % b);
                }
            }
        };

        int resultado1 = mcd.apply(4, 16);
        int resultado2 = mcd.apply(1050, 50);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
