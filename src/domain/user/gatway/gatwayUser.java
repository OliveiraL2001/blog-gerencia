import java.util.List;

public interface UserGateway {
    
    void save(final User aUser);
    User find(final String anId);
    List<User> list();
}

// Este arquivo representa uma interface chamada UserGateway, que define um contrato para operações relacionadas aos usuários. Vamos entender o que cada método está fazendo:

//     void save(final User aUser): Este método é responsável por salvar um novo usuário. Ele recebe um objeto User como parâmetro e o salva na fonte de dados correspondente, como um banco de dados ou armazenamento em memória.

//     User find(final String anId): Este método é responsável por encontrar e retornar um usuário com base no seu ID. Ele recebe o ID do usuário como parâmetro e retorna o objeto User correspondente, se encontrado, ou null se o usuário não for encontrado.

//     List<User> list(): Este método retorna uma lista de todos os usuários existentes. Ele não recebe nenhum parâmetro e simplesmente retorna uma lista de todos os usuários disponíveis.