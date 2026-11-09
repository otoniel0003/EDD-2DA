package eva2_14_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Salid
 */
public class EVA2_14_ITERATOR {

   public static void main(String[] args) {
      LinkedList<Integer> lista = new LinkedList<>();
      for (int i = 0; i < 1000000; i++) {
         lista.add((int)(Math.random() * 1000));
      }
      System.out.println("Cantidad de Nodos: " + lista.size());
      
      Iterator<Integer> iterador = lista.descendingIterator();
      int promedio = 0;
      while(iterador.hasNext()){
         promedio += iterador.next();
      }
      System.out.println("Sumatoria : " + promedio);
      System.out.println("Sumatoria : " + (promedio / 1000000.0));
   }
   
}