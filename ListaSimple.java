package capaEstructuras;
import capaNodos.Nodo;

/**
 *
 * @author Sigrid
 */
public class ListaSimple {
    private Nodo inicio;

    public ListaSimple() {
        inicio=null;
    }
    
    public boolean estaVacia(){
        return (inicio==null);
    }
    
    public void inseratrInicio(Object dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.setSig(inicio);
        inicio=nuevo;
    }
    
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo (dato);
        Nodo actual= inicio;
        //Validar si la lista esta vacia
        if(estaVacia()){
            inicio=nuevo;
        }else{
            while(actual.getSig()!= null){//se lleva a a ctual al final de la fila
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }
    
    //Asume que el primer nodo es el cero
    public void insertarMedio(Object dato, int posicion){
        Nodo nuevo = new Nodo(dato);
        Nodo actual = inicio;
        
        //Si se va a insertar en la posicion 0
        if(posicion==0){
            nuevo.setSig(inicio);
            inicio = nuevo;
        }else{
            
            //Contar la cantidad de pasos que camina para llegar a la celda anterior a la 
            //posicion donde se insertara el nuevo nodo
            for(int i=0; i<posicion;i++){
                actual = actual.getSig();
            }
            nuevo.setSig(actual.getSig());            
        }       
    }
    
    //Retorna y elimina el primer nodo de la lista. Si la lista esta vacia retorna null
    public Object eliminarInicio(){
        Object dato = null;
        if(!estaVacia()){
            dato= inicio.getDato();
            inicio = inicio.getSig();
        }
        return dato;
    }
    
    public Object eliminarFinal(){
        Nodo actual;
        actual = inicio;
        Object dato= null;
        //Revisar si esta vacia
        if(estaVacia()){
            return dato;
        }
        //Revisar si solo hay un nodo
        if(inicio.getSig()==null){
            dato= inicio.getDato();
            inicio=null;
            return dato;
        }
        //Si hay mas de uno nodo - Ciclo para llegar al penultimo nodo
        while(actual.getSig().getSig()!=null){
            actual = actual.getSig();
        }
        dato = actual.getSig().getDato();
        actual.setSig(null);
        return dato;      
    }
    
    public Object eliminarValor(Object pvalor){
        Integer valor= (Integer)pvalor;
        Nodo actual, anterior;
        return valor;    
    }
    
    public int longitudLista(){
        Nodo actual = inicio;
        int cont =0;
        while(actual!= null){
            cont ++;
            actual = actual.getSig();
        }
        return cont;
    }
    
    public String toString(){
        Nodo actual = inicio;
        String hilera= "Contenido de la lista\n";
        while(actual!= null){
            hilera+= actual.getDato()+"  ";
            actual = actual .getSig();
        }
        return hilera;
    }
        
 }
//como se puede apreciar en la mayoria de los metodos se pone un caso base que no se cumple y sino se cumple entonces se cumple la el 
//otro caso con la instruccion deseada
    
    
    

