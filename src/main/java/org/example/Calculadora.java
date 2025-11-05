package org.example;




public class Calculadora {
    /**
     *
     * @param parcelaA
     * @param parcelaB
     * @return resultado da soma de parcelaA com ParcelaB
     */
    public static int somaDoisInteiros(int parcelaA,
                                int parcelaB) {
        int resultado = parcelaA + parcelaB;
        return resultado;
    }

    public int subtracaoDoisInteiros(int minuendo,
                                     int subtraendo) {
        return (minuendo - subtraendo);
    }

    public int multipilcacaoDoisInteiros(int a, int b) {
        a = 66;
        return a * b;
    }

    // TODO (CRIAR UM MÉTODO PARA CALCULAR A POTENCIAÇÃO DE UM NÚMERO DADO.

    public int exponenciacao(int base, int expoente){
        return 0;
    }

    // TODO(IMPLEMENTAR MULTIPLICAÇÃO E DIVISÃO)
}
