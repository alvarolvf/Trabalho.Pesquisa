public class Macaco extends Animal {
    public Macaco(String nome, int idade) {
        super(nome, idade, "Macaco");
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " grita: Uuuh aaah!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo bananas.");
    }
}