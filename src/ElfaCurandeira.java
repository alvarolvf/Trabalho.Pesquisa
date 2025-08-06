public class ElfaCurandeira implements Curandeiro, Atacante {
    private String nome;
    private int mana;
    private int sabedoria;

    public ElfaCurandeira(String nome) {
        this.nome = nome;
        this.mana = 100;
        this.sabedoria = 40;
    }

    @Override
    public void curar() {
        System.out.println(nome + " conjura um feitiço de cura, restaurando 30 de vida!");
        mana -= 10;
    }

    @Override
    public void revigorar() {
        System.out.println(nome + " revigora os aliados com bênçãos élficas!");
        mana -= 15;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " dispara uma flecha mágica que causa " + calcularDano() + " de dano!");
        mana -= 5;
    }

    @Override
    public int calcularDano() {
        return sabedoria + 10;
    }
}