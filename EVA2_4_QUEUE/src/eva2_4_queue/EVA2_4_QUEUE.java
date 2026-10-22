package eva2_4_queue;

/**
 * @author Salid
 */
public class EVA2_4_QUEUE {

   public static void main(String[] args) {
        MyQueue cola = new MyQueue();
        System.out.println("=== QUEUE ===");
        cola.push(100);
        cola.push(200);
        cola.push(300);
        cola.push(400);
        System.out.println("Despues de hacer push:");
        cola.imprimir();
        System.out.println("Peek: " + cola.peek());
        System.out.println("La cola sigue igual despues de peek:");
        cola.imprimir();
        System.out.println("Pop: " + cola.pop());
        System.out.println("Cola despues del primer pop:");
        cola.imprimir();
        System.out.println("Pop: " + cola.pop());
        System.out.println("Cola despues del segundo pop:");
        cola.imprimir();
        System.out.println("Nuevo peek: " + cola.peek());
        System.out.println("Tamanio actual: " + cola.longitud());
   }   
}