public class State implements Comparable<State>{
    public String name;
    // if it is too slow
    //static int number;

    State(String name) {
        this.name = name;
    }

    State(State cp) {
        this.name = cp.name;
    }

    State() {}

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ) {
            return false;
        }
        if (obj instanceof State) {
            if (((State)obj).name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(State o) {
        return this.name.compareTo(o.name);
    }
}
