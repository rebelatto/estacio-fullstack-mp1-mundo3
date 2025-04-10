package model;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Jonison Rebelatto
 */

public class PessoaFisicaRepo  extends PessoaFisica implements Serializable{
    private ArrayList<PessoaFisica> pessoasFisicas;
   
   public PessoaFisicaRepo(){
       this.pessoasFisicas = new ArrayList<PessoaFisica>();
   }
   
   public void inserir(PessoaFisica pessoaFisica) {
        pessoasFisicas.add(pessoaFisica);
        System.out.println("Pessoa física inserida: " + pessoaFisica.getNome());
   }

}
