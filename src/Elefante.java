public class Elefante extends Animal {
    public Elefante(String nome, int idade) {
        super(nome, idade, "Elefante");
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " trombeta: Prrrhh!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo folhas e frutas.");
}
}