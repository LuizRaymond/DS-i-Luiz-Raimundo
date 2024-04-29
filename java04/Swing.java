package java04;
import javax.swing.*;

public class Swing {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        String output = nome + "nome bosta einkkkk";
        JOptionPane.showMessageDialog(null, output);
    }
}
