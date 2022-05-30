package ejercicio4Builder;

public class Cine {
    private BuilderPaquetes builder;

    public Paquetes getPaquetes() {
        return builder.getPaquete();
    }

    public void setBuilder(BuilderPaquetes builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildPipocas();
        this.builder.buildGaseosas();
        this.builder.buildChocolates();
        this.builder.buildHayChocolates();
    }
}
