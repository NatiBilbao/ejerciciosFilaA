package ejercicio4Builder;

public class PaqueteNormal extends BuilderPaquetes{
    @Override
    public void buildPipocas() {
        paquete.setPipocas("Envase normal");
    }

    @Override
    public void buildGaseosas() {
        paquete.setGaseosas("1 refresco");
    }

    @Override
    public void buildChocolates() {
        paquete.setChocolates("");
    }

    @Override
    public void buildHayChocolates() {
        paquete.setHayChocolates(false);
    }
}
