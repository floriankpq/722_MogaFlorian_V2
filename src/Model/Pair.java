package Model;

/**
 * Hilfklasse um Produke:Anzahl zu implementieren
 * @param <T> obj
 * @param <U> obj
 */
public class Pair<T,U> {
    private T left;
    private U right;

    public Pair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public U getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
