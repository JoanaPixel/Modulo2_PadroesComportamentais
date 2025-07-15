package grupo1_observer;

public class Main {
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();

        Usuario joana = new Usuario("Joana");
        Usuario joãoGuilherme = new Usuario("João Guilherme");
        Usuario aurora = new Usuario("Aurora");

        canal.inscrever("esporte", joana);
        canal.inscrever("politica", joãoGuilherme);
        canal.inscrever("tecnologia", joana);
        canal.inscrever("tecnologia", aurora);

        
        System.out.println("📰 Publicando notícias...");
        canal.publicarNoticia("esporte", "Brasil vence por 3x1!");
        canal.publicarNoticia("politica", "Foi aprovado pelo senado projeto que aplica multas a empresas que ferem o meio-ambiente.");
        canal.publicarNoticia("tecnologia", "Foi apresentado pela Samsung novas atualizações para os smartphones lançados entre os anos de 2020-2025!");

        canal.desinscrever("tecnologia", joana);
        canal.publicarNoticia("tecnologia", "'Grok' IA criada pelos desenvolvedores do X !");

        canal.publicarNoticia("entretenimento", "Novo filme estreia esta semana.");
    }
}