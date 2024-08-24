package animais;

public abstract class AnimalTerrestreAB extends AnimalAB {
    protected int quantidadePatas;
    protected double altura;
    protected double peso;

    public AnimalTerrestreAB(String nomeEspecie, int quantidadePatas, double altura, double peso) {
        super(nomeEspecie);
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
    }
}