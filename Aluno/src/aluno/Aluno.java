/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author CAMARGO
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoObj aluno1;
        
        aluno1 = new AlunoObj();
        aluno1.setNome("Louis Raymond");
        System.out.println(aluno1.getNome());
        
        aluno1.setIdade(16);
        System.out.println(aluno1.getIdade());
        
        aluno1.getAluno();
        System.out.println(aluno1.getAluno());
    }
    
}
