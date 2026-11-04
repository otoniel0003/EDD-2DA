package eva2_12_arbol_binario;

/**
 * @author Salid
 */
public class EVA2_12_ARBOL_BINARIO {

   public static void main(String[] args) {
      ArbolBinario arbol = new ArbolBinario();
      arbol.agregar(13);
      arbol.agregar(10);
      arbol.agregar(18);
      arbol.agregar(2);
      arbol.agregar(11);
      arbol.agregar(17);
      arbol.agregar(20);
      arbol.agregar(16);
      System.out.println("preOrden");
      arbol.preOrden();
      System.out.println("inOrden");
      arbol.inOrden();
      System.out.println("postOrden");
      arbol.postOrden();
   }
   
}