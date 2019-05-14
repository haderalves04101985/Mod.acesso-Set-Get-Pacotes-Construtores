/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author ifnmg
 */
public class Aluno {

private String matricula;
private String nome;


//construtor
public Aluno(String n, String m){
    //exec auto qndo classe for criada
    //System.out.println("Construindo um aluno..");
    setNome(n);
    setMatricula(m);

}

public String getNome()
{
    return this.nome;
}

public void setNome(String n)
{

    this.nome=n;
}

public String getMatricula()
{
    return this.matricula;
}

public void setMatricula(String m)
{
    this.matricula=m;
}

}






