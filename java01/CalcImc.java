package java01;
import javax.swing.*;
public class CalcImc {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o nome do pirocudo?");
        String inputPeso = JOptionPane.showInputDialog("Qual o peso da peça?");
        String inputAltura = JOptionPane.showInputDialog("Qual a altura do meninao?");
        
        float peso = Float.parseFloat(inputPeso);
        float altura = Float.parseFloat(inputAltura);
        float imc = peso/(altura * altura);
        String classificação;
        
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, message);
            classificação = "Magreza";
        } else if (imc < 25) {
            JOptionPane.showMessageDialog(null, message);
            classificação = "Normal";
        } else if (imc < 30) {
            JOptionPane.showMessageDialog(null, message);
            classificação = "Sobrepeso";
        } else {
            JOptionPane.showMessageDialog(null, message);
            classificação = "Obeso grau 2";
        }

        
    }
    
}
