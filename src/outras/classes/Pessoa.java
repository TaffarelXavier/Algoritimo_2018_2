/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outras.classes;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Pessoa {
    private static String nome;
    private static String sexo;
    private static int idade;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        Pessoa.sexo = sexo;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int idade) {
        Pessoa.idade = idade;
    }
 
    public static void main(String[] args) {
       Pessoa joao = new Pessoa();
    }
    
}
