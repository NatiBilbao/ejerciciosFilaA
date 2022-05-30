package ejercicio4Builder;

public class PaqueteMediano extends BuilderPaquetes{
    @Override
    public void buildPipocas() {
        paquete.setPipocas(" Pipocas grandes");
    }

    @Override
    public void buildGaseosas() {
        paquete.setGaseosas("2 vasos de refrescos");
    }

    @Override
    public void buildChocolates() {
        paquete.setChocolates("1 chocolate");
        buildHayChocolates();
    }

    @Override
    public void buildHayChocolates() {
        paquete.setHayChocolates(true);
    }
}
