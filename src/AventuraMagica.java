public class AventuraMagica {
    public static void main(String[] args) {
        Dragao dragao = new Dragao("Firagon");
        ElfaCurandeira elfa = new ElfaCurandeira("Lyris");

        System.out.println("  Início da aventura!  \n");

        dragao.apresentar();
        dragao.voar();
        dragao.atacar();
        dragao.pousar();

        System.out.println();

        System.out.println(" Entra em cena a elfa curandeira!");
        elfa.curar();
        elfa.revigorar();
        elfa.atacar();
    }
}