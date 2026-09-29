import loteria.Aposta;
import loteria.ApostaException;
import loteria.Sorteio;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        Sorteio sorteio = new Sorteio() ;
        int quantidadeDeApostas , qtNumerosTemp ;
        Aposta [] arrayDeApostas ;
        Aposta aposta ;
        String nomeApostanteTemp;



        quantidadeDeApostas = lerInteiro(sc , "digite a quantidade de apostas que vão ser criadas") ;

        arrayDeApostas = new Aposta[quantidadeDeApostas] ;


        for (int i = 0 ; i < quantidadeDeApostas ; i++){

            aposta = new Aposta() ;

            System.out.println("Digite o Nome do Apostador numero " + (i+1));
            nomeApostanteTemp = sc.next();
            //validação
            aposta.setNome(nomeApostanteTemp);


            boolean validarQtnumeros = false  ;
            do {
                System.out.println("Selecione Quantos Numeros Voce deseja Apostar:\n5\n6\n7");


                try {
                    qtNumerosTemp = sc.nextInt() ;
                    aposta.setNumerosAposta(qtNumerosTemp);
                }catch( Exception e){
                    System.out.println(e.getMessage());
                    validarQtnumeros = true ;
                }

            }while (validarQtnumeros) ;


            System.out.println("Agora digite numero por Numero que deseja apostar");
            for (int j = 1; j <= aposta.getNumerosAposta().length ; j++){
                int temp ;
                boolean validar = false ;
                do{
                    temp = lerInteiro(sc , "digite o numero " + j ) ;
                    try {
                        aposta.adicionarNumero(j , temp);
                        validar = false ;
                    }catch (ApostaException e){
                        System.out.println(e.getMessage());
                        validar = true ;
                    }

                }while (validar) ;



            }

            arrayDeApostas[i] = aposta ;

        }


        for (int i = 0 ; i < arrayDeApostas.length ; i++){

            System.out.println("Aposta " + (i+1));
            System.out.println("Apostante: "+ arrayDeApostas[i].getNome());
            System.out.println("Numeros Apostados: "+Arrays.toString(arrayDeApostas[i].getNumerosAposta()));
            System.out.println("-".repeat(50));

        }


        System.out.println(" ");
        System.out.println("Os numeros sorteados foram\n" + Arrays.toString(sorteio.getNumerosSorteados()));
        System.out.println("-".repeat(50));


        sorteio.definirVencedor(arrayDeApostas);





    }


    public static int lerInteiro( Scanner scanner , String mensagem){

        boolean validar = false;
        int valor  =  0;

        do {

            System.out.println(mensagem);

            try {
                validar = false ;
                valor = scanner.nextInt() ;

            }catch (Exception e){
                System.out.println("erro , digite apenas numeros");
                scanner.nextLine() ;
                validar = true ;
            }

        }while (validar) ;
        return  valor ;
    }


}
