package Collections;

import java.util.Objects;

public class A {

private Integer id;
private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(id, a.id) && Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
