public class Corvinal extends AlunoMagico {
    public Corvinal(String nome, int nivelMagia, String varinha, String animal) {
        super(nome,  "", nivelMagia, varinha, animal);
    }

    @Override
    public void lancarFeiticoPrincipal() {
        System.out.println(nome + " lança 'Aparecium!' com inteligência!");
    
    }
    @Override
     public void realizarAtividadeMagica() {
        System.out.println(getNome() + "se estuda na biblioteca por horas");
    
    }
}
