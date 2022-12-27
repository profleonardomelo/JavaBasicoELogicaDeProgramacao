/*
Usando JOptionPane, elabore uma classe que receba o nome de um produto
e o seu valor. O desconto deve ser calculado conforme o valor
fornecido pela Tabela presente no arquivo
"ProgramaExercicioCalcularValorDoProdutoComDescPorFaixaDeValor.png".
Utilizando a estrutura if-else, apresente em tela o nome do produto,
valor original do produto e o novo valor após ser realizado o desconto.
Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem de aviso.
Ver exemplo de execução no arquivo
"ProgramaExercicioCalcularValorDoProdutoComDescPorFaixaDeValor.png".
*/

//Define o pacote que contém esta classe
package Java_20_ProgramaExercicioCalcularValorDoProdutoComDescPorFaixaDeValor;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaExercicioCalcularValorDoProdutoComDescPorFaixaDeValor_C"
public class ProgramaExercicioCalcularValorDoProdutoComDescPorFaixaDeValor_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {

        //Lê, em uma caixa de diálogo, um texto digitado pelo usuário e guarda em uma variável
        String nomeDoProduto = JOptionPane.showInputDialog("Entre com o nome do produto: ");

        //Lê, em uma caixa de diálogo, um texto digitado pelo usuário e guarda em uma variável
        String strValorDoProduto = JOptionPane.showInputDialog("Entre com o valor do produto: ");

        //Converte um valor de uma variável do tipo String para float
        float valorDoProduto = Float.parseFloat(strValorDoProduto);

        //Declara e inicializa um variável do tipo float
        float valorDoDesconto = 0;
        //Declara e inicializa um variável do tipo float
        float percentualDeDesconto = 0;

        //Se valor do produto é maior ou igual a 50 e menor que 200, faça:
        if(valorDoProduto >= 50 && valorDoProduto < 200)
        {
            //Atribui valor a uma variável
            percentualDeDesconto = 5;
            //Realiza o cálculo do valor de desconto
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        //Caso contrário, se valor do produto é maior ou igual a 200 e menor que 500, faça:
        else if(valorDoProduto >= 200 && valorDoProduto < 500)
        {
            //Atribui valor a uma variável
            percentualDeDesconto = 6;
            //Realiza o cálculo do valor de desconto
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        //Caso contrário, se valor do produto é maior ou igual a 500 e menor que 1000, faça:
        else if(valorDoProduto >= 500 && valorDoProduto < 1000)
        {
            //Atribui valor a uma variável
            percentualDeDesconto = 7;
            //Realiza o cálculo do valor de desconto
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }
        //Caso contrário, se valor do produto é maior ou igual a 1000, faça:
        else if(valorDoProduto >= 1000)
        {
            //Atribui valor a uma variável
            percentualDeDesconto = 8;
            //Realiza o cálculo do valor de desconto
            valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
        }

        //Declara e inicializa um variável do tipo float com o resultado de um cálculo
        float valorDoProdutoComDesconto = valorDoProduto - valorDoDesconto;

        //Declara e inicializa um variável do tipo String com concatenanções de textos
        String mensagem = "Nome do produto: " + nomeDoProduto +
                "\nValor do produto: " + valorDoProduto +
                "\nValor do produto com desconto de " + percentualDeDesconto +
                "%: " + valorDoProdutoComDesconto;

        //Exibe para o usuário a mensagem final concatenanda
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
