package eva2_12_arbol_binario;

/**
 * @author Salid
 */
public class Nodo {
   
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;

    public Nodo() {
        derecha = null;
        izquierda = null;
    }

    public Nodo(int dato) {
        this.valor = dato;
        derecha = null;
        izquierda = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setValor(int dato) {
        this.valor = dato;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
}