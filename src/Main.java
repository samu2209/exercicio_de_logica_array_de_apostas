import loteria.Aposta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        Aposta primeiroApostador , segundoApostador , terceiroApostador ;
        primeiroApostador = new Aposta();
        segundoApostador = new Aposta();
        terceiroApostador = new Aposta();
        String nomeApostanteTemp;
        int qtNumerosTemp ;

        // vou fazer primeiro com 1 apostador
        System.out.println("Digite o Nome do Primeiro Apostador: ");
        nomeApostanteTemp = sc.next();
        primeiroApostador.setNome(nomeApostanteTemp);

        System.out.println("Selecione Quantos Numeros Voce deseja Apostar:\n5\n6\n7");
        qtNumerosTemp = sc.nextInt() ;
        primeiroApostador.setNumerosAposta(qtNumerosTemp);

        System.out.println("Agora digite numero por Numero que deseja apostar");
        for (int i = 1; i <= primeiroApostador.getNumerosAposta().length ; i++){
            int temp ;
            System.out.println("numero " + i);
            temp = sc.nextInt() ;
            primeiroApostador.adicionarNumero(i , temp);
        }

        System.out.println(Arrays.toString(primeiroApostador.getNumerosAposta()));









    }
}
