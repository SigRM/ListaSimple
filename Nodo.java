package capaNodos;

/**
 *
 * @author  Sigrid

 */
public class Nodo {
    private  Object dato;
    private Nodo sig;
      
      public Nodo(Object dato){
          this.dato =dato;
          this.sig = null;
      }
      public Nodo(){
          this.dato = 0;
          this.sig = null;
      }
      
      public String toString(){
          return  dato.toString();
      }
      public Object getDato() {
          return dato;
      }

      public void setDato(Object dato) {
          this.dato = dato;
      }

      public Nodo getSig() {
          return sig;
      }

      public void setSig(Nodo sig) {
          this.sig = sig;
      }
}
   
