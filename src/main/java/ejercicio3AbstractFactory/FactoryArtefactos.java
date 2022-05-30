package ejercicio3AbstractFactory;

public class FactoryArtefactos {
    public static Artefactos make(String artifactType){
        Artefactos artefacto;
        switch (artifactType.toLowerCase()){
            case "television":
                artefacto = new Television();
                break;
            case "radio":
                artefacto = new Radio();
                break;
            case "batidora":
                artefacto = new Batidora();
            case "refrigerador":
                artefacto = new Refrigerador();
                break;
            case "microondas":
                artefacto = new Microondas();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return artefacto;
    }
}
