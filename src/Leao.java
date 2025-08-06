public class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade, "Leão");
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " ruge: Roooaar!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo carne.");
    }
}
