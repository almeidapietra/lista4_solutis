package animais;

import interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nomeEspecie;
    protected int comidaIngerida;
    protected int caminhoPercorrido;
    protected int horasDormidas;

    public AnimalAB(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer(int quantidade) {
        if (quantidade > 0) {
            comidaIngerida += quantidade;
            System.out.printf("O %s comeu %d unidades de comida.%n", nomeEspecie, quantidade);
        } else {
            System.out.println("Quantidade de comida deve ser maior que zero.");
        }
    }

    @Override
    public void moverse(int distancia) {
        if (distancia > 0) {
            caminhoPercorrido += distancia;
            System.out.printf("O %s moveu-se %d unidades de distância.%n", nomeEspecie, distancia);
        } else {
            System.out.println("Distância deve ser maior que zero.");
        }
    }

    @Override
    public void dormir(int horas) {
        if (horas > 0) {
            horasDormidas += horas;
            System.out.printf("O %s dormiu por %d horas.%n", nomeEspecie, horas);
        } else {
            System.out.println("Quantidade de horas deve ser maior que zero.");
        }
    }
}
