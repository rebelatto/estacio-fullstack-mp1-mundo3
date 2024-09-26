/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

/**
 *
 * @author rebelatto
 */
public class Pessoa implements Serializable {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public void setId (int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNome (String nome){
         this.nome = nome;
    }
    
    public String getNome(){
       return nome;
    }
    
    protected void exibir(int id, String nome){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }
 
}
