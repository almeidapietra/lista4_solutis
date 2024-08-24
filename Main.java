public class Main {
    public static void main(String[] args) {
        // Testando animais terrestres
        AnimalTerrestreAB cachorro = new Cachorro("Rex", 4, 0.5, 15.0);
        cachorro.comer(10);
        cachorro.moverse(5);
        cachorro.dormir(7);

        AnimalTerrestreAB gato = new Gato("Mimi", 4, 0.3, 4.0);
        gato.comer(5);
        gato.moverse(3);
        gato.dormir(8);

        AnimalTerrestreAB elefante = new Elefante("Dumbo", 4, 2.5, 3000.0);
        elefante.comer(50);
        elefante.moverse(20);
        elefante.dormir(12);

        AnimalTerrestreAB leao = new Leao("Simba", 4, 1.2, 180.0);
        leao.comer(30);
        leao.moverse(10);
        leao.dormir(10);

        // Testando animais marinhos
        AnimalMarinhoAB peixe = new Peixe("Nemo", "recife de coral", 0.5);
        peixe.comer(5);
        peixe.nadar(15);
        peixe.dormir(6);

        // Testando animais voadores
        AnimalVoadorAB pombo = new Pombo("Pombinho", 2, 0.8, 0.3);
        pombo.comer(3);
        pombo.voar(20);
        pombo.dormir(5);
    }
}
