/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import model.PessoaFisica;
import model.PessoaJuridica;
/**
 *
 * @author rebelatto
 */

public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Pessoa p = new Pessoa( 01, "Jonison");
        // p.exibir(p.getId(),p.getNome());
     
        PessoaFisica pf = new PessoaFisica(1, "Jonison Rebelatto", "111.111.111-111" ,35);
        pf.exibir(pf.getId(), pf.getNome(), pf.getCpf(), pf.getIdade());
        
        PessoaJuridica pj = new PessoaJuridica(1, "Foxmit", "11.111.111/0001-11");
        pj.exibir(pj.getId(), pj.getNome(), pj.getCnpj());
    }   
}
