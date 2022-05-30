package ejercicio3AbstractFactory;

public class Cliente {
    public static void main(String[] args) {
        Artefactos television = FactoryArtefactos.make("television");
        television.setPrecio(5000);
        System.out.println("El precio del televisor es de: " + television.getPrecio() + "bs");

        Artefactos radio = FactoryArtefactos.make("radio");
        radio.setPrecio(500);
        System.out.println("El precio de la radio es de: " + radio.getPrecio() + "bs");

        Artefactos batidora = FactoryArtefactos.make("batidora");
        batidora.setPrecio(180);
        System.out.println("El precio de la batidora es de: " + batidora.getPrecio() + "bs");

        Artefactos refrigerador = FactoryArtefactos.make("refrigerador");
        refrigerador.setPrecio(8000);
        System.out.println("El precio del refrigerador es de: " + refrigerador.getPrecio() + "bs");

        Artefactos microondas = FactoryArtefactos.make("microondas");
        microondas.setPrecio(2000);
        System.out.println("El precio del microondas es de: " + microondas.getPrecio() + "bs");


    }
}
