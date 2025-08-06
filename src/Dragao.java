public class Dragao extends CriaturaMagica {
    private int poderDeFogo;

    public Dragao(String nome) {
        super(nome, 10, 200);
        this.poderDeFogo = 50;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " cospe fogo e causa " + calcularDano() + " de dano!");
    }

    @Override
    public int calcularDano() {
        return poderDeFogo + (nivel * 2);
    }

    @Override
    public void voar() {
        System.out.println(nome + " alça voo com suas enormes asas!");
    }

    @Override
    public void pousar() {
        System.out.println(nome + " pousa com força, causando tremores!");
    }
}