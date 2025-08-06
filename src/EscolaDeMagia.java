public class EscolaDeMagia {
    public static void main(String[] args) {
        AlunoMagico[] alunos = new AlunoMagico[3];

        alunos[0] = new Grifinoria("Harry", 8, "Azevinho", "Coruja");
        alunos[1] = new Sonserina("Draco", 7, "Teixo", "Serpente");
        alunos[2] = new Corvinal("Luna", 9, "Videira", "Lebre");

        System.out.println("⚡ Bem-vindo à Escola de Magia! ⚡\n");

        for (AlunoMagico aluno : alunos) {
            aluno.apresentar("Saudações mágicas!");
            aluno.lancarFeiticoPrincipal();
            aluno.realizarAtividadeMagica();
            System.out.println("Nível de Magia: " + aluno.getNivelMagia());
            System.out.println("Animal: " + aluno.getAnimal());
            System.out.println();
        }
    }

}