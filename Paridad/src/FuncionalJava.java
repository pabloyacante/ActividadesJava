import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {

        Function<Integer, Boolean> esPar = x -> x % 2 == 0;


        boolean resultado1 = esPar.apply(8);
        boolean resultado2 = esPar.apply(23);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
