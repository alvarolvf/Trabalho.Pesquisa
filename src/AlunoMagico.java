public abstract class AlunoMagico implements Magia {
    protected String nome;
    private String casa;
    private int nivelMagia;
    private String varinha;
    private String animal;

    public AlunoMagico(String nome, String casa, int nivelMagia, String varinha, String animal) {
        this.nome = nome;
        this.casa = casa;
        this.nivelMagia = nivelMagia;
        this.varinha = varinha;
        this.animal = animal;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " da casa " + casa + "!");
    }

    // Método sobrecarregado
    public void apresentar(String saudacao) {
        System.out.println(saudacao + " Eu sou " + nome + ", da casa " + casa + ".");
    }

    public abstract void lancarFeiticoPrincipal();

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCasa() { return casa; }
    public int getNivelMagia() { return nivelMagia; }
    public String getVarinha() { return varinha; }
    public String getAnimal() { return animal; }

    public void setNivelMagia(int nivelMagia) { this.nivelMagia = nivelMagia;}
}