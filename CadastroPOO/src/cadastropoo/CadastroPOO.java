/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaFisicaRepo;
import controler.Menu;
/**
 *
 * @author rebelatto
 */

public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       PessoaFisica pf1 = new PessoaFisica(1, "Jonison Rebelatto", "111.111.111-111", 35);
       PessoaFisica pf2 = new PessoaFisica(2, "Elaine Germina", "111.111.111-111", 37);
       pf1.exibir();
       pf2.exibir();
        
        PessoaJuridica pj1 = new PessoaJuridica(1, "Foxmit", "11.111.111/0001-11");
        PessoaJuridica pj2 = new PessoaJuridica(2, "Be King", "11.111.111/0001-11");
        pj1.exibir();
        pj2.exibir();
        
        
        PessoaFisicaRepo repo = new PessoaFisicaRepo();
        
        repo.inserir(pf1);
        repo.inserir(pf2);
        
        
        Menu menu = new Menu();
        menu.exibirMenu();
    }   
}
