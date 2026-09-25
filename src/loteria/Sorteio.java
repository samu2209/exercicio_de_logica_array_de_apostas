package loteria;

import java.util.Random;

public class Sorteio {

    private int[] numerosSorteados ;


    public Sorteio(){
        numerosSorteados = new int[5];
        gerarNumeroSorteio();
    }

    private void gerarNumeroSorteio(){
        int numeroSorteado;
        Random random = new Random() ;
        for(int i = 0 ; i < numerosSorteados.length ; i++ ){
            do {
                numeroSorteado = random.nextInt(1 ,100);
            }while (numeroRepetido(numeroSorteado))  ;

            numerosSorteados[i] = numeroSorteado;
        }
    }
    private boolean numeroRepetido(int numero){

        for(int i = 0 ; i < numerosSorteados.length ; i++ ){
            if( numero == numerosSorteados[i]){
                return  true;
            }
        }
        return false;
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }


}
