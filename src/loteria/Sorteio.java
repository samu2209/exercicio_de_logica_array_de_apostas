package loteria;

import java.util.Arrays;
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


    public void definirVencedor(Aposta[] apostas){

        int acertos ;
        int maiorQtAcertos = 0 , apostasVencedoras = 0  ;
        Aposta[] vencedores ;
        for (int i = 0 ; i < apostas.length ; i++){
            acertos = apostas[i].getAcertos();
            if (acertos > maiorQtAcertos){
                maiorQtAcertos = acertos ;
                apostasVencedoras++;
            }
        }
        vencedores = new Aposta[apostasVencedoras] ;

        for (int j = 0 ; j < apostas.length ; j++){
            acertos = apostas[j].getAcertos();
            int cont = 0 ;
            if (acertos == maiorQtAcertos){
                vencedores[cont] = apostas[j] ;
                cont++ ;
            }
        }


        System.out.println("vencedores com " + maiorQtAcertos + " acertos são: ");
        System.out.println("-".repeat(50));
        for (int k = 0 ; k < vencedores.length ; k++){
            System.out.println("vencedor "+ k);
            System.out.println(vencedores[k].getNome());
            System.out.println(Arrays.toString(vencedores[k].getNumerosAposta()));
            System.out.println("-".repeat(50));
        }



    }



}
