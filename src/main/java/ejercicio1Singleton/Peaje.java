package ejercicio1Singleton;

import java.util.ArrayList;
public enum Peaje {
    PEAJE;
    ArrayList<Vehiculo> registroDeVehiculos = new ArrayList<>();
    int cobroPeaje = 0;

    public void cobrarPeaje(Vehiculo vehiculo){
        switch (vehiculo.getModelo().toLowerCase()){
            case "ford":
                cobroPeaje += 10;
                System.out.println("Se hizo el cobro de 10bs al vehiculo modelo Ford");
                break;
            case "volkswagen":
                cobroPeaje += 6;
                System.out.println("Se hizo el cobro de 6bs al vehiculo modelo Volkswagen");
                break;
            case "nissan":
                cobroPeaje += 8;
                System.out.println("Se hizo el cobro de 8bs al vehiculo modelo Nissan");
                break;
        }

        registroDeVehiculos.add(vehiculo);
    }
    public void totalPeajeRecaudado(){
        System.out.println("Por el momento se tiene " + cobroPeaje + "bs de " + registroDeVehiculos.size() + " vehiculos");
    }
    public void verVehiculosQuePasaron(){
        System.out.println("En total pasaron " + registroDeVehiculos.size() + " vehiculos");
        for(int i = 0; i < registroDeVehiculos.size(); i ++){
            System.out.println("Vehiculo " + (i+1));
            System.out.println("- Placa: " + registroDeVehiculos.get(i).getPlaca());
            System.out.println("- Modelo: " + registroDeVehiculos.get(i).getModelo());
            System.out.println("- Color: " + registroDeVehiculos.get(i).getColor());
        }
    }
}

