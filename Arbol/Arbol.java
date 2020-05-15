import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arbol<T> {

    private T value;
    private List<Arbol<T>> children;

    private Arbol(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Arbol<T> of(T value) {
        return new Arbol<>(value);
    }

    public T getValue() {
        return value;
    }

    public List<Arbol<T>> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Arbol<T> addChild(T value) {
        Arbol<T> newChild = new Arbol<>(value);
        children.add(newChild);
        return newChild;
    }
}