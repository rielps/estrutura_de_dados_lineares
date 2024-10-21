import java.util.Vector;

public class PilhaVector<T> implements Pilha<T> {
    private Vector<T> elementos; // Aqui serão armazenados os elementos do pilha

    public PilhaVector() {
        this.elementos = new Vector<>(); // Construtor do nosso vetor
    }

    @Override
    public void push(T elemento) {
        elementos.add(elemento); // Adiciona o elemento ao topo da pilha
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");  // Lança exceção se a pilha estiver vazia
        }
        return elementos.remove(elementos.size() - 1); // Remove o elemento do topo
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();  // Verifica se o Vector está vazio
    }

    @Override
    public T topo() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");  // Lança exceção se a pilha estiver vazia
        }
        return elementos.lastElement();  // Retorna o elemento do topo sem removê-lo
    }
}
