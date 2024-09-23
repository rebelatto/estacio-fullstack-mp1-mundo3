/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rebelatto
 */
public class PessoaJuridica extends Pessoa{
    public String cnpj;
     
    public PessoaJuridica(int id, String nome, String cnpj){
        super(id, nome);
        this.cnpj = cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
     public void exibir(int id, String nome, String cnpj){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
    }
}
