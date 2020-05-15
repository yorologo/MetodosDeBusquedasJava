import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Nodo<T> {

    private T contenido;
    private Set<Nodo<T>> vecinos;

    public Nodo(T value) {
        this.contenido = value;
        this.vecinos = new HashSet<>();
    }

    public T getValue() {
        return contenido;
    }

    public Set<Nodo<T>> getNeighbors() {
        return Collections.unmodifiableSet(vecinos);
    }

    public void connect(Nodo<T> nodo) {
        if (this == nodo) throw new IllegalArgumentException("El nodo no se puede conectar consigo mismo");
        this.vecinos.add(nodo);
        nodo.vecinos.add(this);
    }

}
