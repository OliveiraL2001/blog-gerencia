import java.util.List;

public interface PostGateway {
    
    void save(final Post aPost);
    Post find(final String anId);
    List<Post> list();
    List<Post> listByUser(final String anUserId);
}

// Este arquivo representa uma interface chamada PostGateway, que define um contrato para operações relacionadas aos posts. Vamos entender o que cada método está fazendo:

//     void save(final Post aPost): Este método é responsável por salvar um novo post. Ele recebe um objeto Post como parâmetro e o salva na fonte de dados correspondente, como um banco de dados ou armazenamento em memória.

//     Post find(final String anId): Este método é responsável por encontrar e retornar um post com base no seu ID. Ele recebe o ID do post como parâmetro e retorna o objeto Post correspondente, se encontrado, ou null se o post não for encontrado.

//     List<Post> list(): Este método retorna uma lista de todos os posts existentes. Ele não recebe nenhum parâmetro e simplesmente retorna uma lista de todos os posts disponíveis.

//     List<Post> listByUser(final String anUserId): Este método retorna uma lista de todos os posts associados a um usuário específico. Ele recebe o ID do usuário como parâmetro e retorna uma lista de todos os posts publicados por esse usuário.

