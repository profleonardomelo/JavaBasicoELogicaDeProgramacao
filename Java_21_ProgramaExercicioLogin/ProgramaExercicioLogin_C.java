/*
Faça uma classe que solicite login e senha, simulando
o acesso a um sistema. Considere que os conteúdos de
login e senha originais são iguais a “java”. O usuário
deverá fornecer login e senha e você irá compará-los
com os conteúdos originais. O usuário tem três chances
para digitar corretamente os dados de login e senha.
Para cada tentativa incorreta deve aparecer uma
mensagem alertando o erro e apresentando a quantidade
de tentativas que ainda restam. Veja um exemplo de
execução no arquivo "ProgramaExercicioLogin.png", em que o usuário já
digitou o login e senha incorretos por duas vezes,
restando apenas uma última chance.
*/

//Define o pacote que contém esta classe
package Java_21_ProgramaExercicioLogin;

//Importando Classe
import javax.swing.JOptionPane;

//Cria uma classe pública chamada "ProgramaExercicioLogin_C"
public class ProgramaExercicioLogin_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {

        //Cria uma estrutura de repetição (for) que repete um código interno três vezes
        for (int i = 1; i <= 3; i++)
        {
            //Lê, em uma caixa de diálogo, um texto digitado pelo usuário e guarda em uma variável
            String login = JOptionPane.showInputDialog("Forneça um Login: ");
            //Lê, em uma caixa de diálogo, um texto digitado pelo usuário e guarda em uma variável
            String senha = JOptionPane.showInputDialog("Forneça uma Senha: ");

            //Se login for igual a 'java' e senha for igual a 'java', faça:
            if (login.equals("java") && senha.equals("java")) {
                //Mostra caixa de diálogo com mensagem de sucesso.
                JOptionPane.showMessageDialog(null, "Login e senha aceitos.");
                //Interrompe a interações da estrutura de repetição for
                break;
            }
            else
            {
                //Concatena e armazena texto que será exibe em caso de falha no acesso ao sistema (com número de tentativas).
                String mensagem = "Falha, verifique login e senha.\nVocê tem mais " + (3 - i) + " tentativa(s).";
                //Mostra caixa de diálogo com mensagem de falha.
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }

    }

}
