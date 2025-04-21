package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros2 {
        List<Integer> numeros = new ArrayList<>();

        public void adicionarNumeros(Integer numero){
            numeros.add(numero);
        }

        @Override
        public String toString() {
            return "SomaNumeros2{" +
                    "numeros=" + numeros +
                    '}';
        }

        public Integer calcularSoma(){
                Integer soma = 0;
                for (int i = 0; i < numeros.size(); i++) {
                    soma += numeros.get(i);
                }
                return soma;
            }

        public Integer encontrarMenorNumero(){
            int num = numeros.get(0);
            for (int i = 0; i < numeros.size(); i++){
                if (numeros.get(i) < num) {
                    num = numeros.get(i);
                }
            }
            return num;
        }

        public Integer encontrarMaiorNumero(){
            int num = numeros.get(0);
            for (int i = 0; i < numeros.size(); i++){
               if (numeros.get(i) > num) {
                   num = numeros.get(i);
               }
            }
            return num;
        }

        public ArrayList exibirNumeros(){
            ArrayList<Integer> exibirNumeros = new ArrayList<Integer>();
            for (int i = 0; i < numeros.size(); i++) {
                exibirNumeros.add(numeros.get(i));
            }
            return exibirNumeros;
        }



    public static void main(String[] args) {
        SomaNumeros2 somaNumeros2 = new SomaNumeros2();
        somaNumeros2.adicionarNumeros(2);
        somaNumeros2.adicionarNumeros(5);
        somaNumeros2.adicionarNumeros(1);
        somaNumeros2.adicionarNumeros(13);
        somaNumeros2.adicionarNumeros(11);
        somaNumeros2.adicionarNumeros(6);
        somaNumeros2.adicionarNumeros(7);

        System.out.println(somaNumeros2.exibirNumeros());
        System.out.println(somaNumeros2.calcularSoma());
        System.out.println(somaNumeros2.encontrarMaiorNumero());
        System.out.println(somaNumeros2.encontrarMenorNumero());



    }
}

