/*
Faça uma classe que apresente em tela a tabuada de qualquer número. 
O usuário fornece o número desejado e a classe apresenta a relação 
de todos os cálculos de 1 a 10. Ver exemplo de execução no arquivo 
"ProgramaExercicioTabuada.png".
*/

//Define o pacote que contém esta classe
package Java_22_ProgramaExercicioTabuada;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaExercicioTabuada_C"
public class ProgramaExercicioTabuada_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {

        //Lê, em uma caixa de diálogo, um texto digitado pelo usuário e guarda em uma variável
        String strNumero = JOptionPane.showInputDialog("Forneça um número: ");

        //Converte um valor de uma variável do tipo String para int
        int numero = Integer.parseInt(strNumero);

        //Declara e inicializa um variável do tipo String
        String mensagem = "";

        //Cria uma estrutura de repetição (for) que repete um código interno 10 vezes
        for (int i = 1; i <= 10; i++) {
            //Concatenação do texto de cada linha da tabuada do número digitado e cálculo
            mensagem += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        //Exibe para o usuário a mensagem final concatenanda
        JOptionPane.showMessageDialog(null, mensagem);
    }

}