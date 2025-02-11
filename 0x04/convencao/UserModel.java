public class UserModel { // Nome da classe corrigido para Usuario

    private int id; // Variável corrigida para id, seguindo camelCase

    private String descricao; // Variável corrigida para descricao

    public static final int IDADE_MINIMA = 18; // Constante corrigida para IDADE_MINIMA, seguindo SNAKE_CASE

    // Métodos corrigidos para seguir camelCase e ter nomes mais descritivos
    public List<Usuario> buscarTodos() {
        return new ArrayList<>(); // Retorna uma lista vazia, ou sua lógica de busca
    }

    public List<Usuario> listarTodos() {
        return new ArrayList<>(); // Retorna uma lista vazia, ou sua lógica de busca
    }

    public List<Usuario> obterTodos() {
        return new ArrayList<>(); // Retorna uma lista vazia, ou sua lógica de busca
    }
}