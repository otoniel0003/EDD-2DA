package eva2_4_queue;

/**
 * @author Salid
 */
public class Nodo {
   private int valor;
   private Nodo siguiente;
   private Nodo previo;
   
   public Nodo(){
      siguiente = null;
      this.previo = null;
   }
   public Nodo(int dato){
      this.valor = dato;
      siguiente = null;
      this.previo = null;
   }
   
   public int getValor() {
      return valor;
   }

   public Nodo getSiguiente() {
      return siguiente;
   }

   public void setValor(int dato) {
      this.valor= dato;
   }

   public void setSiguiente(Nodo siguiente) {
      this.siguiente = siguiente;
   }

   public Nodo getPrevio() {
      return previo;
   }

   public void setPrevio(Nodo previo) {
      this.previo = previo;
   }
   
}