package br.com.renanravelli.binary.search;

/**
 * @author renanravelli
 */

/*
    O algoritmo tem como objetivo realizar uma busca binária utilizando a menor
    quantidade de chances possíveis.
    Aplicando a formula logarítmica (log2n) é possível saber a quantidade de vezes
    necessária pra chegar ao resultado da busca.
 */
public class BinarySearchIndex {

    public int search(int[] vetor, int item) {
        var baixo = 0;
        var alto = vetor.length - 1;

        // aplicar busca binaria.
        return aplicarBusca(vetor, item, baixo, alto);
    }

    // esse método é o Core, onde é aplicado toda a regra para encontra o index.
    private int aplicarBusca(int[] vetor, int item, int baixo, int alto) {
        var meio = (baixo + alto) / 2; // encontramos o index do meio no vetor
        var opcaoAtual = vetor[meio]; // obtemos a valor do index

        // caso a opcao seja igual ao item que deseja encontrar, retornamos.
        if (opcaoAtual == item) {
            return meio;
        }

        if (opcaoAtual > item) {
            // caso a opcao seja maior, descartamos a metade superior do vetor
            alto = meio - 1;
        } else {
            // caso a opcao seja menor, descartamos a metade inferior do vetor
            baixo = meio + 1;
        }

        // caso o index baixo seja menor ou igual ao index alto, aplicamos recursividade.
        if (baixo <= alto) {
            return aplicarBusca(vetor, item, baixo, alto);
        }
        throw new IllegalArgumentException("Not found the item in a index.");
    }
}
