import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static <T> Optional<Nodo<T>> busqueda(T contenido, Nodo<T> origen) {
        Queue<Nodo<T>> cola = new ArrayDeque<>();
        cola.add(origen);

        Nodo<T> nodoActual;
        Set<Nodo<T>> visitados = new HashSet<>();

        while (!cola.isEmpty()) {
            nodoActual = cola.remove();

            System.out.println("Nodo visitado: " + nodoActual.getValue());

            if (nodoActual.getValue().equals(contenido))
                return Optional.of(nodoActual);
            else {
                visitados.add(nodoActual);
                cola.addAll(nodoActual.getNeighbors());
                cola.removeAll(visitados);
            }
        }

        return Optional.empty();
    }

}
