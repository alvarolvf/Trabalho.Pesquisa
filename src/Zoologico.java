public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Leao("Simba", 5);
        animais[1] = new Elefante("Dumbo", 10);
        animais[2] = new Macaco("George", 3);

        System.out.println(" Bem-vindo ao zoológico!");

        for (Animal animal : animais) {
            animal.exibirInformacoes();
            animal.fazerSom(); // polimorfismo em ação
            animal.alimentar(); // outro exemplo de polimorfismo
            System.out.println("-----");
        }
    }
}
