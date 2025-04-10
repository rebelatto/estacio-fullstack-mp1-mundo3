package model;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 *
 * @author Jonison Rebelatto
 */

public class PessoaFisicaRepo  implements Serializable{
    private List<PessoaFisica> pessoaFisica;

   public PessoaFisicaRepo(){
       this.pessoaFisica = new ArrayList<PessoaFisica>();
   }
   
   public void inserir(PessoaFisica pessoaFisica) {
        pessoaFisica.add(pessoaFisica);
        System.out.println("Pessoa física inserida: " + pessoaFisica.getNome());
   }

}
