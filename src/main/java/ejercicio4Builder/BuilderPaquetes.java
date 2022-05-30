package ejercicio4Builder;

public abstract class BuilderPaquetes {
    protected Paquetes paquete;

    public Paquetes getPaquete() {
        return paquete;
    }

    public void createPaquete() {
        this.paquete = new Paquetes();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosas();
    public abstract void buildChocolates();
    public abstract void buildHayChocolates();
}
