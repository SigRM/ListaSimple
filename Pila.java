package capaEstructuras;

import capaNodos.Nodo;

/**
 *
 * @author Sigrid
 */
public class Pila {
  private Nodo inicio; 
    //Constructores
    public Pila(){
        inicio = null;
    }
    
    public boolean isEmpty(){      
       return this.inicio==null; //Si inicio == null retorna un true, en caso contrario retorna un false
    }
    
    public void  push(Object dato){   //insertarFinal
       Nodo nuevo = new Nodo(dato);
       Nodo actual;
       if(isEmpty()){
           inicio= nuevo;
       }else{
           actual = inicio;
           while(actual.getSig()!= null){
               actual = actual.getSig();
           }
           actual.setSig(nuevo);
       }
    }
    
    
    public Object pop(){//eliminar del final
        Nodo actual;
        actual=inicio;
        Object dato = null;
        if(!isEmpty()){
            if(inicio.getSig()==null){
                dato=inicio.getDato();
                inicio=null;
            }else{
                while(actual.getSig().getSig() !=null){//actual se coloca en el penultimo nodo
                    actual = actual.getSig();
                }
                dato = actual.getSig().getDato();
                actual.setSig(null);
            }
        }   
       return dato;
    }
    
    
    public String toString(){
        Nodo actual = inicio;
        String hilera = "Contenido de la pila\n";
        while(actual != null){
            hilera += actual.toString() + "  "; 
            actual = actual.getSig();
        }
        return hilera;
    }
}
   
