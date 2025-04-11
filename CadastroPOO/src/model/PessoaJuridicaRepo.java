package model;
import java.io.*;
import java.util.ArrayList;

public class PessoaJuridicaRepo {
    private ArrayList<PessoaJuridica> empresas = new ArrayList<>();

    public void inserir(PessoaJuridica empresa) {
        empresas.add(empresa);
    }

    public void alterar(PessoaJuridica empresa) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getId() == empresa.getId()) {
                empresas.set(i, empresa);
                return;
            }
        }
    }

    public void excluir(int id) {
        empresas.removeIf(e -> e.getId() == id);
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica e : empresas) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return new ArrayList<>(empresas);
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(empresas);
        } catch (IOException  e) {
        e.printStackTrace();
    }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            empresas = (ArrayList<PessoaJuridica>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
