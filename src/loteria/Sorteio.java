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

    public void gerarQtAcertos(Aposta[] apostas){
        for (int i = 0 ; i < apostas.length ; i++ ){
            apostas[i].quantidadeDeAcertos(numerosSorteados);
        }
    }


    public void definirVencedor(Aposta[] apostas){


        gerarQtAcertos(apostas);

        int acertos ;
        int maiorQtAcertos = 0 , apostasVencedoras = 0  ;
        Aposta[] vencedores ;

        for (int i = 0 ; i < apostas.length ; i++){
            acertos = apostas[i].getAcertos();
            if (acertos > maiorQtAcertos){
                maiorQtAcertos = acertos ;
                apostasVencedoras = 1;
            } else if (acertos == maiorQtAcertos) {
                apostasVencedoras++ ;
            }

        }
        vencedores = new Aposta[apostasVencedoras] ;

        int cont = 0 ;
        for (int i = 0 ; i < apostas.length ; i++){
            acertos = apostas[i].getAcertos();
            if (acertos == maiorQtAcertos){
                vencedores[cont] = apostas[i] ;
                cont++ ;
            }
        }


        System.out.println("vencedores com " + maiorQtAcertos + " acertos são: ");
        System.out.println("-".repeat(50));
        for (int i = 0 ; i < vencedores.length ; i++){
            System.out.println("vencedor "+ (i + 1));
            System.out.println(vencedores[i].getNome());
            System.out.println(Arrays.toString(vencedores[i].getNumerosAposta()));
            System.out.println("-".repeat(50));
        }



    }



}
