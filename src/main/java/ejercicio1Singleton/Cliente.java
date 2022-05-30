package ejercicio1Singleton;

public class Cliente {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("4495JHQ", "Ford", "Plomo");
        Vehiculo vehiculo2 = new Vehiculo("1294CMV", "Nissan", "Azul");
        Vehiculo vehiculo3 = new Vehiculo("2400MMG", "Nissan", "Naranja");
        Vehiculo vehiculo4 = new Vehiculo("1307LMC", "Volkswagen", "Guindo");
        Vehiculo vehiculo5 = new Vehiculo("3175VCH", "Ford", "Negro");
        Vehiculo vehiculo6 = new Vehiculo("1224GMC", "Nissan", "Rojo");

        Peaje.PEAJE.cobrarPeaje(vehiculo1);
        Peaje.PEAJE.cobrarPeaje(vehiculo2);
        Peaje.PEAJE.cobrarPeaje(vehiculo3);
        Peaje.PEAJE.cobrarPeaje(vehiculo4);
        Peaje.PEAJE.cobrarPeaje(vehiculo5);
        Peaje.PEAJE.cobrarPeaje(vehiculo6);

        Peaje.PEAJE.totalPeajeRecaudado();
        Peaje.PEAJE.verVehiculosQuePasaron();

    }

}
