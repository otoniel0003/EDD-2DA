/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
* @author Salid 
*/

 
package eva2_2_lista_simple;


public class ListaSimple {
   private Nodo inicio;
   private Nodo fin;
   private int tamanio;

   public ListaSimple(){
      inicio = null;
      fin = null;
      tamanio = 0;
   }

   public void agregar(int valor){
      Nodo nuevo = new Nodo(valor);

      if(inicio == null){
         inicio = nuevo;
         fin = nuevo;
      }else{
         fin.setSiguiente(nuevo);
         fin = nuevo;
      }
      tamanio++;
   }

   public void imprimir(){
      Nodo temp = inicio;
      while(temp != null){
         System.out.println("[" + temp.getValor() + "]");
         temp = temp.getSiguiente();
      }
   }

   public int longitud(){
      return tamanio;
   }

   public boolean listaVacia(){
      if(inicio == null){
         return true;
      }else{
         return false;
      }
   }

   public void vaciarLista(){
      inicio = null;
      fin = null;
      tamanio = 0;
   }

   public int valorEn(int posicion) throws RuntimeException {
      int tama = longitud();

      if(posicion >= 0 && posicion < tama){
         Nodo temp = inicio;

         for(int i = 0; i < posicion; i++){
            temp = temp.getSiguiente();
         }

         return temp.getValor();

      }else{
         throw new RuntimeException(
            "La posicion " + posicion + " no es valida!!!"
         );
      }
   }

   public int encontrarEn(int valor){
      Nodo temp = inicio;
      int posicion = 0;

      while(temp != null){
         if(temp.getValor() == valor){
            return posicion;
         }
         temp = temp.getSiguiente();
         posicion++;
      }

      return -1;
   }

   public void insertarEn(int valor, int posicion){
      int tama = longitud();

      if(posicion < 0 || posicion > tama){
         throw new RuntimeException(
            "La posicion " + posicion + " no es valida!!!"
         );
      }

      Nodo nuevo = new Nodo(valor);

      if(inicio == null){
         inicio = nuevo;
         fin = nuevo;

      }else if(posicion == 0){
         nuevo.setSiguiente(inicio);
         inicio = nuevo;

         Nodo temp = inicio;

         for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguiente();
         }

         nuevo.setSiguiente(temp.getSiguiente());

         temp.setSiguiente(nuevo);

         if(posicion == tama){
            fin = nuevo;
         }

         tamanio++;
      }
   }

   public void borrarEn(int posicion){
      if(inicio == null){
         throw new RuntimeException(
            "No se puede borrar: la lista esta vacia"
         );
      }

      int tama = longitud();

      if(posicion < 0 || posicion >= tama){
         throw new RuntimeException(
            "La posicion " + posicion + " no es valida!!!"
         );
      }

      if(inicio == fin){
         inicio = null;
         fin = null;

      }else if(posicion == 0){
         inicio = inicio.getSiguiente();

      }else{
         Nodo temp = inicio;

         for(int i = 0; i < posicion - 1; i++){
            temp = temp.getSiguiente();
         }

         Nodo borrar = temp.getSiguiente();

         temp.setSiguiente(borrar.getSiguiente());

         if(borrar == fin){
            fin = temp;
         }
      }

      tamanio--;
   }

   public void imprimirInverso(){
      for(int i = longitud() - 1; i >= 0; i--){
         System.out.println("[" + valorEn(i) + "]");
      }
   }
}
