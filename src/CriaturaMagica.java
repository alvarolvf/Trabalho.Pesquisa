public abstract class CriaturaMagica implements Atacante, Voador {
    protected String nome;
    protected int nivel;
    protected int vida;

    public CriaturaMagica(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public void apresentar() {
        System.out.println("  Eu sou " + nome + ", nível " + nivel + " com " + vida + " de vida!");
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " sofreu " + dano + " de dano. Vida restante: " + vida);
    }

    // Métodos abstratos das interfaces
    public abstract void atacar();
    public abstract int calcularDano();
    public abstract void voar();
    public abstract void pousar();
}