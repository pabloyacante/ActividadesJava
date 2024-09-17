import java.util.function.BiFunction;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función potencia usando una función auxiliar
        BiFunction<Integer, Integer, Integer> potencia = new BiFunction<>() {
            @Override
            public Integer apply(Integer base, Integer exponente) {
                // Definir una función recursiva como auxiliar
                BiFunction<Integer, Integer, Integer> auxiliar = (b, e) -> {
                    if (e == 0) {
                        return 1;
                    } else {
                        return b * this.apply(b, e - 1); // Llamada recursiva usando 'this'
                    }
                };
                return auxiliar.apply(base, exponente);
            }
        };

        // Probar la función potencia
        int resultado = potencia.apply(5, 3); // 2^3 = 8
        System.out.println(resultado); // Salida: 8
    }
}