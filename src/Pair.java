import java.util.Objects;
import java.util.function.Supplier;

/*
 * Copyright Gheoace Mihai
 */
public class Pair<K, V> {
    K first;
    V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first.toString() + ", " + second + ")";
    }
}
