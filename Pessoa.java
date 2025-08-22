public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;  // 'this' refere-se ao atributo da classe
        this.idade = idade;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    // Método para verificar se é maior de idade
    public boolean ehMaiorIdade() {
        return idade >= 18;  // Retorna true se idade >= 18
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}