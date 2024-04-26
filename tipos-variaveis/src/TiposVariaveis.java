public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Alguns tipos de variaveis
        String nome = "Diego"; // apesar de String ser uma classe ela é muito usada como um tipo 

        int idade;  // a variavel pode ser declarada sem inicializar 
        int anoFabricação = 1990;  // aqui a variavel anoFabricação foi iniciada com o valor 1990
        double salarioMinimo = 2.500; // aqui a variavel do tipo double foi inicializada com o valor real de 2.500

        short numeroCurto =  1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;  // se não fizessemos um cast aqui ele não iria rodar
                                                   //  pois um int não caberia num short

        //Constantes
        final double VALOR_DE_PI = 3.14;  // Por ter o final na frente e o nome em caixa alta ele 
                                          // passa a ser uma constante
    }
}
