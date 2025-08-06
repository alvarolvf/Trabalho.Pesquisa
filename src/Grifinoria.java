public class Grifinoria extends AlunoMagico {
    public Grifinoria(String nome, int nivelMagia, String varinha, String animal) {
        super(nome, "Grifonaria", nivelMagia, varinha, animal);
    }

    @Override
    public void lancarFeiticoPrincipal() {
        System.out.println(getNome() + " lança 'Expelliarmus!' com bravura!");
    }

    @Override
    public void realizarAtividadeMagica() {
        System.out.println(getNome() + " pratica duelo mágico no salão principal.");
    }
}