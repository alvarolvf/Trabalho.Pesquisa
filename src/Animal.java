public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void exibirInformacoes() {
        System.out.println(nome + " (" + especie + "), " + idade + " anos");
    }

    // Métodos polimórficos
    public abstract void fazerSom();
    public abstract void alimentar();
}