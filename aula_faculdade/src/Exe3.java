import javax.swing.*;

public class Exe3 {
    public static void main(String[] args) {

        float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua média: "));

        if(media<7){
            System.out.println("Você precisa estudar mais");
        }
        else if(media==7){
            System.out.println("Você foi aprovado");
        }
        else if(media>7 && media<8){
            System.out.println("Parabéns, suas notas foram acima da média");
        }
        else if(media>=8 && media<9){
            System.out.println("Parabéns, sua média ficou próxima da nota máxima");
        }
        else{
            System.out.println("Parabéns, você é um excelente aluno");
        }
    }
}
