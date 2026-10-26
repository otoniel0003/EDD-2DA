package eva2_8_recursividad;

/**
 * @author Salid
 */
public class EVA2_8_RECURSIVIDAD {

   public static void main(String[] args) {
      imprimirCiclo(5);
      imprimirRecu(5);
   }
   
   public static void imprimirCiclo(int numero){
      for (int i = numero; i >= 1; i--) {
         System.out.print(i + " - ");
      }
      System.out.println("");
   }
   
   public static void imprimirRecu(int numero){
      System.out.print(numero + " - ");
      if(numero > 1) 
      imprimirRecu(numero - 1);
   }
   
}