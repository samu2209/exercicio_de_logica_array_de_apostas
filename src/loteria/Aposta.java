package loteria;

public class Aposta {

    private String nome ;
    private int[] numerosAposta;
    private int acertos ;



    public void setNumerosAposta(int qtNumeros){

        if (qtNumeros < 5 || qtNumeros > 7 ){
            throw new ApostaException("Quantidade de numeros invalidos") ;
        }else{
            this.numerosAposta = new int[qtNumeros];
        }

    }
    public void adicionarNumero(int indice , int numeroApostado){
        if(validarNumeroAposta(numeroApostado)){
            this.numerosAposta[indice - 1] = numeroApostado;
        }
    }
    public boolean  validarNumeroAposta(int numeroAposta){
        if (numeroAposta <= 0){
            throw  new ApostaException("Não pode ser usado numero inferior a 1 para Aposta");
        }else if(numeroAposta > 99){
            throw new ApostaException("Não pode ser usado numero Superior a 99 para aposta");
        }
        boolean igualdade = validaIqualdade(numeroAposta) ;

        if (igualdade){
            throw new ApostaException("Não Pode Ser usado numero Igual Para mesma Aposta") ;
        }

        return true ;

    }

    public boolean validaIqualdade(int valor){

        for(int i = 0 ; i < this.numerosAposta.length ; i++ ){
            if(valor == numerosAposta[i]){
              return true ;
            }
        }
            return false ;
    }

    public void quantidadeDeAcertos(Sorteio sorteio){

        // pegar numero por numero do sorteio
        // verificar se o numero tem no meus numeros sorteados
        // se tem acrescento 1 acerto
        // se não tem nada muda
        // no fim vou ter o numero total de acertos
        int acertos = 0 ;
        int[] numerosDoSorteio = sorteio.getNumerosSorteados() ;
        for(int i = 0 ; i < numerosDoSorteio.length ; i++){
            if( validaIqualdade(numerosDoSorteio[i]) ){
                acertos++ ;
            }
        }

        this.acertos = acertos ;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getNumerosAposta() {
        return numerosAposta;
    }

    public int getAcertos() {
        return acertos;
    }
}
