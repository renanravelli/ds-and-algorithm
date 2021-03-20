package br.com.renanravelli.sorting;

/**
 * @author renanravelli
 */
public class HeapSort {

    public void sorting(final int[] vetor) {
        int tamanho = vetor.length;

        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, tamanho, i);
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            aplicarTroca(vetor, 0, i);
            aplicarHeap(vetor, i, 0);
        }
    }

    private void aplicarHeap(int[] vetor, int tam, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < tam && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }

        if (direita < tam && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            aplicarTroca(vetor, i, raiz);
            aplicarHeap(vetor, tam, raiz);
        }
    }

    private void aplicarTroca(int[] vetor, int i, int raiz) {
        int aux = vetor[i];
        vetor[i] = vetor[raiz];
        vetor[raiz] = aux;
    }
}
