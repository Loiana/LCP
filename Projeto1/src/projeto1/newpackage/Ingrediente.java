/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1.newpackage;


    
    
/**
 *
 * @author aluno
 */
public class Ingrediente {
    int quantidade;
    String nome;

    private String[] categoria = {
        "Tempero",
        "",
        ""
    };
    
    Ingrediente (String nome, int quantidade, String categoria) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria =  categoria;
    }
    

}
