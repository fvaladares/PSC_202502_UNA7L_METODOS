package org.example;




public class Calculadora {
    /**
     *
     * @param parcelaA
     * @param parcelaB
     * @return resultado da soma de parcelaA com ParcelaB
     */
    public int somaDoisInteiros(int parcelaA,
                                int parcelaB) {
        int resultado = parcelaA + parcelaB;
        return resultado;
    }

    public int subtracaoDoisInteiros(int minuendo,
                                     int subtraendo) {
        return (minuendo - subtraendo);
    }

    // TODO(IMPLEMENTAR MULTIPLICAÇÃO E DIVISÃO)
}
