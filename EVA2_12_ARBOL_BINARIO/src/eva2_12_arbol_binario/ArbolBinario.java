package eva2_12_arbol_binario;

/**
 * @author Salid
 */
public class ArbolBinario {
   private Nodo root;

    public ArbolBinario() {
        root = null;
    }

    public void agregar(int valor) {
        root = agregarRecu(root, valor);
    }

    private Nodo agregarRecu(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.getValor()) {
            actual.setIzquierda(agregarRecu(actual.getIzquierda(), valor)
            );
        } else if (valor > actual.getValor()) {
            actual.setDerecha(agregarRecu(actual.getDerecha(), valor)
            );
        }
        return actual;
    }
    
    public void preOrden(){
       preOrdenRecu(root);
       System.out.println("");
    }
    
    private void preOrdenRecu(Nodo actual){
       if(actual != null){
          System.out.print(actual.getValor() + "-");
          preOrdenRecu(actual.getIzquierda());
          preOrdenRecu(actual.getDerecha());
       }
    }
    
    public void inOrden(){
       inOrdenRecu(root);
       System.out.println("");
    }
    
    private void inOrdenRecu(Nodo actual){
       if(actual != null){
        inOrdenRecu(actual.getIzquierda());
        System.out.print(actual.getValor() + "-");
        inOrdenRecu(actual.getDerecha());
         }
    }
    
    public void postOrden(){
        postOrdenRecu(root);
        System.out.println("");
      }

    private void postOrdenRecu(Nodo actual){
        if(actual != null){
         postOrdenRecu(actual.getIzquierda());
         postOrdenRecu(actual.getDerecha());
         System.out.print(actual.getValor() + "-");
    }
  }
}