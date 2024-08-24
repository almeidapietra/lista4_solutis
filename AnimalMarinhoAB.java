public abstract class AnimalMarinhoAB extends AnimalAB {
    protected String habitat;
    protected double peso;

    public AnimalMarinhoAB(String nomeEspecie, String habitat, double peso) {
        super(nomeEspecie);
        this.habitat = habitat;
        this.peso = peso;
    }

    public abstract void nadar(int distancia);

    @Override
    public void moverse(int distancia) {
        nadar(distancia);
    }
}
