package ejercicio4Builder;

public class Cliente {
    public static void main(String[] args) {
        Cine cine = new Cine();
        BuilderPaquetes megaPaquete = new MegaPaquete();
        BuilderPaquetes paqueteMediano = new PaqueteMediano();
        BuilderPaquetes paqueteNormal = new PaqueteNormal();


        cine.setBuilder(megaPaquete);
        cine.buildProduct();
        Paquetes megaPaquete1 = cine.getPaquetes();
        megaPaquete1.showInfo();

        cine.setBuilder(paqueteMediano);
        cine.buildProduct();
        Paquetes paqueteMediano2 = cine.getPaquetes();
        paqueteMediano2.showInfo();

        cine.setBuilder(paqueteNormal);
        cine.buildProduct();
        Paquetes paqueteNormal3 = cine.getPaquetes();
        paqueteNormal3.showInfo();

    }
}
