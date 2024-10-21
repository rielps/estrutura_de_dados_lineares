public interface Pilha<t> { //o <T> serve pra definir um tipo generico, que pode ser substiruido por qualquer outro tipo posteriormente
    void push(t elemento);
    t size();
    t pop();
    t topo();
    boolean isEmpty();
}
