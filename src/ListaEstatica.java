public class ListaEstatica {

    int[] vetor;
    int capacidade;
    int n_elementos;

    public ListaEstatica(int cap){
        vetor = new int[cap]; //instanciando
        n_elementos = 0;
        capacidade = cap;
    }
    public boolean estaVazia(){
        return n_elementos == 0;
    }
    public boolean estaCheia(){
        return n_elementos == capacidade;
    }
    public void insereInicio(int elemento){
        if(estaCheia()){
            System.out.println("Lista cheia");
            return;
        }
        for(int i = n_elementos; i > 0; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[0] = elemento;
        n_elementos++;
    }
    public void insereFinal(int elemento){
        if(estaCheia()){
            System.out.println("Lista cheia");
            return;
        }
        vetor[n_elementos] = elemento;
        n_elementos++;
    }
    public void removeInicio(){
        if(estaVazia()){
            System.out.println("Lista vazia");
            return;
        }
        for(int i = 0; i < n_elementos - 1; i++){
            vetor[i] = vetor[i+1];
        }
        n_elementos--;
    }
    public void inserePosicao(int elemento, int posicao){
        if(estaCheia()){
            System.out.println("Lista cheia");
            return;
        }
        for(int i = n_elementos; i > posicao; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[posicao] = elemento;
        n_elementos++;
    }
    public void removePosicao(int posicao){
        if(estaVazia()){
            System.out.println("Lista cheia");
            return;
        }
        for(int i = 0; i < n_elementos; i--){
            vetor[i] = vetor[i-1];
        }
        n_elementos--;
    }
    public void removeFinal(int elemento){
        if(estaVazia()){
            System.out.println("Lista vazia");
            return;
        }
       vetor [n_elementos] = 0;
    }

    public void imprime(){
        System.out.println("Elementos da lista: ");
        for(int i = 0; i < n_elementos; i++){
            System.out.println(vetor[i]);
        }
        System.out.println();
    }ç
    public void imprimeMemoria(){
        System.out.println("Memoria: ");
        for(int i = 0; i < capacidade; i++){
            System.out.println(vetor[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ListaEstatica lista = new ListaEstatica(5);
        lista.imprimeMemoria();
        lista.insereFinal(10);
        lista.insereFinal(20);
        lista.insereFinal(30);
        lista.insereFinal(40);
        lista.imprime();
        lista.insereInicio(5);
        //lista.removeFinal(40);
        lista.imprimeMemoria();
        lista.imprime();
        lista.removeInicio();
        lista.imprime();
        lista.imprimeMemoria();
        lista.inserePosicao(15, 2);
        lista.imprime();
        lista.imprimeMemoria();
        lista.removePosicao(0);
        lista.imprime();
        lista.imprimeMemoria();
    }
}
