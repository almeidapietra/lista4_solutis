public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, String habitat, double peso) {
        super(nome, habitat, peso);
    }

    @Override
    public void nadar(int distancia) {
        System.out.printf("O %s nadou %d unidades de distância.%n", nomeEspecie, distancia);
        caminhoPercorrido += distancia;
    }

    // Pode-se sobrescrever comer e dormir se necessário, senão a implementação de AnimalAB será utilizada
}