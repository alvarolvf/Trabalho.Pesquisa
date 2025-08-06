public class Sonserina extends AlunoMagico {
    public Sonserina(String nome, int nivelMagia, String varinha, String animal) {
        super (nome,  "sonserina", nivelMagia, varinha, animal);
    }

    @Override
    public void lancarFeiticoPrincipal() {
        System.out.println(nome + " lança 'Serpensortia!' com astúcia!");
    }

    @Override
     public void realizarAtividadeMagica() {
        System.out.println(getNome() + " pratica partida de quadribol no campo!");
    }
}