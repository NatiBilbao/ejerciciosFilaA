package ejercicio4Builder;

public class MegaPaquete extends BuilderPaquetes {
    @Override
    public void buildPipocas() {
        paquete.setPipocas("Pipocas extragrandes");
    }

    @Override
    public void buildGaseosas() {
        paquete.setGaseosas("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolates() {
        paquete.setChocolates("2 chocolates grandes");
    }

    @Override
    public void buildHayChocolates() {
        paquete.setHayChocolates(true);
    }
}
