package ejercicio4Builder;

public class Paquetes {
    private String pipocas;
    private String gaseosas;
    private String chocolates;

    private boolean hayChocolates;

    public boolean isHayChocolates() {
        return hayChocolates;
    }

    public Paquetes setHayChocolates(boolean hayChocolates) {
        this.hayChocolates = hayChocolates;
        return this;
    }

    public String getPipocas() {
        return pipocas;
    }

    public Paquetes setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public String getGaseosas() {
        return gaseosas;
    }

    public Paquetes setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
        return this;
    }

    public String getChocolates() {
        return chocolates;
    }

    public Paquetes setChocolates(String chocolates) {
        this.chocolates = chocolates;
        return this;
    }

    public void showInfo() {
        System.out.println("Pipocas: " + this.getPipocas());
        System.out.println("Refresco: " + this.getGaseosas());
        if(this.isHayChocolates()){
            System.out.println("Chocolate: " + this.getChocolates());
        }
    }
}
