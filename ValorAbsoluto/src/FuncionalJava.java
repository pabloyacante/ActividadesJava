import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {

        Function<Integer, Integer> valAbsoluto = x -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };


        int resultado1 = valAbsoluto.apply(-200);
        int resultado2 = valAbsoluto.apply(200);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
