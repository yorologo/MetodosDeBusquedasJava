import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;

public class DFS {

    public static <T> Optional<Arbol<T>> busqueda(T contnido, Arbol<T> raiz) {
        Stack<Arbol<T>> cola = new Stack<>();
        cola.add(raiz);

        Arbol<T> nodoActual;
        while (!cola.isEmpty()) {
            nodoActual = cola.pop();
            System.out.println("Nodo visitado: " + nodoActual.getValue());

            if (nodoActual.getValue().equals(contnido))
                return Optional.of(nodoActual);
            else
                cola.addAll(nodoActual.getChildren());
        }

        return Optional.empty();
    }

}
