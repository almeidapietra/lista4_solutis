public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int quantidadeAssas, double envergaduraAssa, double altura) {
        super(nome, quantidadeAssas, envergaduraAssa, altura);
    }

    @Override
    public void voar(int distancia) {
        System.out.printf("O %s voou %d unidades de distância.%n", nomeEspecie, distancia);
        caminhoPercorrido += distancia;
    }

    // Pode-se sobrescrever comer e dormir se necessário, senão a implementação de AnimalAB será utilizada
}
