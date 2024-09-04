import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncionalJava {
    public static void main(String[] args) {
        // Definir la función q1
        Function<List<Integer>, List<List<Integer>>> q1 = new Function<List<Integer>, List<List<Integer>>>() {
            @Override
            public List<List<Integer>> apply(List<Integer> list) {
                if (list.isEmpty()) {
                    List<List<Integer>> result = new ArrayList<>();
                    result.add(new ArrayList<>());
                    return result;
                } else {
                    Integer x = list.get(0);
                    List<Integer> xs = list.subList(1, list.size());
                    List<List<Integer>> sub = apply(xs);
                    List<List<Integer>> result = new ArrayList<>();

                    for (List<Integer> ys : sub) {
                        List<Integer> newList = new ArrayList<>(ys);
                        newList.add(0, x);
                        result.add(newList);
                    }

                    result.addAll(sub);
                    return result;
                }
            }
        };

        // Probar la función q1
        List<Integer> input = List.of(1, 2, 3);
        List<List<Integer>> result = q1.apply(input);

        System.out.println(result); // Salida: [[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]
    }
}
