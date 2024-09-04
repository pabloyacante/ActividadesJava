import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {

        Function<Integer, Integer> sumatoria = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                if (n == 0) {
                    return 0;
                } else {
                    return n + this.apply(n - 1);
                }
            }
        };

        int resultado = sumatoria.apply(7);
        System.out.println(resultado);
    }
}
