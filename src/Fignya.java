import java.util.Objects;

public class Fignya {
    String name;
    double x;

    public Fignya(String name, double x) {
        this.name = name;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fignya fignya = (Fignya) o;
        return Double.compare(x, fignya.x) == 0 && Objects.equals(name, fignya.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x);
    }
    @Override
    public String toString() {
        return "Fignya{name='" + name + "', x=" + x + "}";
    }
}

