// Classe principal para testar
public class TestePessoa {
    public static void main(String[] args) {
        // Criando objetos Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 16);

        // Usando métodos dos objetos
        pessoa1.exibirInfo();
        System.out.println("É maior de idade? " + pessoa1.ehMaiorIdade());

        pessoa2.exibirInfo();
        System.out.println("É maior de idade? " + pessoa2.ehMaiorIdade());
    }
}