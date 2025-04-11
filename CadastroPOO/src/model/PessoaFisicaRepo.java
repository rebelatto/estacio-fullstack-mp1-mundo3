package model;
import java.io.*;
import java.util.*;

public class PessoaFisicaRepo {
    private ArrayList<PessoaFisica> pf = new ArrayList<>();

    public void inserir(PessoaFisica pessoa) {
        pf.add(pessoa);
    }

    public void alterar(PessoaFisica pessoa) {
        for (int i = 0; i < pf.size(); i++) {
            if (pf.get(i).getId() == pessoa.getId()) {
                pf.set(i, pessoa);
                return;
            }
        }
    }

    public void excluir(int id) {
        pf.removeIf(p -> p.getId() == id);
    }

    public PessoaFisica obter(int id) {
        for (PessoaFisica p : pf) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public ArrayList<PessoaFisica> obterTodos() {
        return new ArrayList<>(pf);
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(pf);
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pf = (ArrayList<PessoaFisica>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

