package capaEstructuras;

import capaNodos.Nodo;

/**
 *
 * @author Sigrid
 */
public class Cola {
     private Object [] elementos;
  private Nodo inicio;
   
    public Cola(){
        inicio = null;
    }
    
    public boolean isEmpty(){
        return(this.inicio==null);
        
    }
    
    public void add(Object dato){//agrega un objeto al final de la cola
        Nodo nuevo = new Nodo(dato);
        Nodo actual;
        if(isEmpty()){
            inicio= nuevo;
        }else{
            actual= inicio;
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }
    
    public Object poll(){  //Elimina y retorna el primer nodo de la cola      
        Object dato= null;  //Se declara de tipo Integer para que acepte nulos
        if(!isEmpty()){
            dato= inicio.getDato();
            inicio = inicio.getSig();
        }
        return dato;
    }
    
    public String toString(){
        Nodo actual = inicio;
        String hilera = "";
        while(actual != null){
            hilera += actual.toString() + "  "; 
            actual = actual.getSig();
        }
        return hilera;
    }
} 
    

