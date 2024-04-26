public class Operadores {
    public static void main(String[] args) {

        // O operador de atribuição '=' é utilizado para definir um valor inicial ou
        // sobrescrever
        // o valor de uma variável. Ex:

        String nome = "Diego"; // adicionamos o valor diego a variável nome
        int idade = 38; // adicionamos o valor 38 a variável idade
        double peso = 68.5; // adicionamos o valor de 68.5 a variavel peso
        char sexo = 'M'; // adicionamos o valor de M a variável sexo
        boolean doadoraOrgao = false; // adicionamos o valor false a variável doadoraOrgao
        // Date dataNascimento = new Date(); //estariamos criando um tipo de objeto da
        // classe Date

        // Operadores aritméticos são utilizados para realizar operações matemáticas
        // entre valores numéricos

        double soma = 10.5 + 15.7; // neste caso iremos somar os dois valores
        int subtracao = 113 - 25; // neste caso estamos subtraindo um valor do outro
        int multiplicacao = 20 * 7; // neste caso estamos multiplicando os valores
        int divisao = 15 / 3; // neste caso estamos dividindo um valor pelo outro
        int modulo = 18 % 3; // neste caso estamos verificando o resto da divisão de um valor pelo outro
        double resultado = (10 * 7) + (20 / 4); // aqui estamos fazendo varias operações para termos o resultado

        // Obs: o caracter + quando utilizado com Strings ele ira concatenar ex:

        String nome1 = "Diego";
        String sobreNome = " Soares da Silva";
        System.out.println(nome1 + sobreNome); // estamos concatenando os valores das variáveis nome1 e sobreNome
        
        
    }
}
