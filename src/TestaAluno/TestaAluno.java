/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaAluno;

import escola.Aluno;



/**
 *
 * @author ifnmg
 */
public class TestaAluno {

    public static void main(String[] Args)
    {
    
    Aluno a1=new Aluno("Hader","221944");
    //a1.setNome("Hader");
    //a1.setMatricula("221944");
    
    System.out.println(a1.getNome());
    System.out.println(a1.getMatricula());
    
    }

    
}
