
package pkg2021_1_ads1an_vlb_vetor_dinamico;

public class VetorDinamico {
    private int[] elementos;
    private int quantidade;
    private int capacidade;
    
    public VetorDinamico() {
        this.capacidade = 4;
        this.elementos = new int[4];
    }
    public VetorDinamico(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
    }
    public boolean estaCheio() {
        return this.capacidade == this.quantidade;
    }
    public boolean estaVazio() {
        if (this.quantidade == 0)
            return true;
        return false;
        //return this.quantidade == 0;
    }
    public void inserir (int elemento) {
        if (this.estaCheio()) {
            this.ajustarCapacidade(2);
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }
    public void exibir() {
        System.out.println("quantidade: " + this.quantidade + " capacidade: " + this.capacidade);
        for (int i=0; i<this.quantidade; i++){
            System.out.print(this.elementos[i] + " ");
        }
        System.out.println();
    }
    public void remover (){
        if (!this.estaVazio()) {
            this.quantidade--;
            if (this.capacidade > 4 && this.quantidade <= this.capacidade/4) {
                this.ajustarCapacidade(0.5);
            }
        }
    }
    private void ajustarCapacidade(double valor) {
        //ajustar a variável capacidade
        this.capacidade = (int) (this.capacidade * valor);
        
        //alocar um novo vetor com o dobro da capacidade do atual
        int[] aux = new int[this.capacidade];
        //copiar todos os elementos para o novo vetor
        for (int i=0; i<this.quantidade; i++) {
            aux[i] = this.elementos[i];
        }
        //ajustar a variável de referência elementos para que ela referencie o novo vetor (aux)
        this.elementos = aux;   
    }
}
