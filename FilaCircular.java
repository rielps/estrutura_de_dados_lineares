public class FilaCircular implements Fila<Integer> {
    private int[] fila;
    private int ultimo;
    private int primeiro;
    private int capacidade;
    private int tamanho;
    
    
    public FilaCircular(int capacidade){
        this.capacidade = capacidade;
        fila = new int [capacidade];
        primeiro = 0;
        ultimo = 0;
        tamanho = 0;
    }

    @Override
    public void adicionar(int elemento){
        if (tamanho == capacidade){
            throw new RuntimeException("Acabou o espaço");
        }

        fila[ultimo] = elemento;
        ultimo = (ultimo + 1) % capacidade; // Move o ponteiro rear circularmente
        tamanho++;
    }

    @Override
    public void remover(){
        if (tamanho == 0){
            throw new RuntimeException("fila vazia");
        }
        primeiro = (primeiro + 1) % primeiro;
        tamanho--;
    }
    
    @Override
    public int proximo(){
        if (tamanho == 0){
            throw new RuntimeException("fila vazia");
        }
        return(fila[primeiro]);
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }
}
