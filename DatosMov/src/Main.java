import java.util.ArrayList;
import java.util.List;

// Clase para representar el tipo de datos Mov
abstract class Mov {
    int value;

    Mov(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + value;
    }
}

class N extends Mov {
    N(int value) {
        super(value);
    }
}

class S extends Mov {
    S(int value) {
        super(value);
    }
}

class E extends Mov {
    E(int value) {
        super(value);
    }
}

class O extends Mov {
    O(int value) {
        super(value);
    }
}

// Clase para representar el tipo de datos Paseo
class Paseo<T> {
    private final Mov mov;
    private final Paseo<T> nextPaseo;
    private final T descanso;

    private Paseo(Mov mov, Paseo<T> nextPaseo) {
        this.mov = mov;
        this.nextPaseo = nextPaseo;
        this.descanso = null;
    }

    private Paseo(T descanso) {
        this.mov = null;
        this.nextPaseo = null;
        this.descanso = descanso;
    }

    public static <T> Paseo<T> Pasos(Mov mov, Paseo<T> nextPaseo) {
        return new Paseo<>(mov, nextPaseo);
    }

    public static <T> Paseo<T> Descansa(T descanso) {
        return new Paseo<>(descanso);
    }

    @Override
    public String toString() {
        if (descanso != null) {
            return "Descansa " + descanso;
        } else {
            return "Pasos " + mov + " " + nextPaseo;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Paseo con los valores 20, 30, 10, 40, 0
        Paseo<Integer> paseo = Paseo.Pasos(new N(20),
                Paseo.Pasos(new S(30),
                        Paseo.Pasos(new E(10),
                                Paseo.Pasos(new O(40),
                                        Paseo.Descansa(0)))));

        // Imprimir el objeto Paseo
        System.out.println(paseo);
    }
}
