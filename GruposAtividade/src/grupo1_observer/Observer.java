package grupo1_observer;

import java.util.*;

interface Observer {
    void update(String categoria, String mensagem);
}

class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String categoria, String mensagem) {
        System.out.println("[" + nome + "] Nova notícia em " + categoria.toUpperCase() + ": " + mensagem);
    }
}

class CanalNoticias {
    private Map<String, List<Observer>> assinantesPorCategoria = new HashMap<>();

    public CanalNoticias() {
        assinantesPorCategoria.put("esporte", new ArrayList<>());
        assinantesPorCategoria.put("politica", new ArrayList<>());
        assinantesPorCategoria.put("tecnologia", new ArrayList<>());
    }

    public void inscrever(String categoria, Observer o) {
        List<Observer> lista = assinantesPorCategoria.get(categoria.toLowerCase());
        if (lista != null && !lista.contains(o)) {
            lista.add(o);
        }
    }

    public void desinscrever(String categoria, Observer o) {
        List<Observer> lista = assinantesPorCategoria.get(categoria.toLowerCase());
        if (lista != null) {
            lista.remove(o);
        }
    }

    public void publicarNoticia(String categoria, String mensagem) {
        List<Observer> lista = assinantesPorCategoria.get(categoria.toLowerCase());
        if (lista != null) {
            for (Observer o : lista) {
                o.update(categoria, mensagem);
            }
        } else {
            System.out.println("Categoria '" + categoria + "' não existe.");
        }
    }
}


    


