public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;
    protected double altura;

    public AnimalVoadorAB(String nomeEspecie, int quantidadeAssas, double envergaduraAssa, double altura) {
        super(nomeEspecie);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
        this.altura = altura;
    }

    public abstract void voar(int distancia);

    @Override
    public void moverse(int distancia) {
        voar(distancia);
    }
}
