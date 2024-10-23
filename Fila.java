public interface Fila<T> {
    void adicionar(T elemento);  
    T remover();                 
    T proximo();                 
    int size();                  
    boolean isEmpty();   
}        
