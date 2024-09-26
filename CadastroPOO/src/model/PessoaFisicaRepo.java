/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.PessoaFisica;
/**
 *
 * @author rebelatto
 */
public class PessoaFisicaRepo  {
   private final List<PessoaFisica> pessoasFisicas;
   
   public PessoaFisicaRepo(){
       this.pessoasFisicas = new ArrayList<>();
   }
   
   public void inserir(PessoaFisica pessoaFisica) {
        pessoasFisicas.add(pessoaFisica);
        System.out.println("Pessoa física inserida: " + pessoaFisica.getNome());
    }
   
   /*public void inserir (){
       
   }*/
}
