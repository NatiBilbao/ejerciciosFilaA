package ejercicio2Prototype;

public class Cliente {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        tv1.setSistemaOperativo("Android");
        tv1.setVersionSistemaOperativo("11.0");
        tv1.setPulgadas(80);
        tv1.setResolucion(50);
        tv1.setPuertoHDMI(true);
        tv1.setPuertosUSB(4);
        tv1.setControlRemoto(true);
        tv1.setBluetooth(true);
        tv1.setSerialTelevisor("10 digitos");
        tv1.showInfo();

        Televisor tv2 = tv1.clone();
        tv2.setSerialTelevisor("5 digitos");
        tv2.showInfo();

        Televisor tv3 = tv1.clone();
        tv3.setSerialTelevisor("8 digitos");
        tv3.showInfo();

        Televisor tv4 = tv1.clone();
        tv4.setSerialTelevisor("4 digitos");
        tv4.showInfo();

        Televisor tv5 = tv1.clone();
        tv5.setSerialTelevisor("6 digitos");
        tv5.showInfo();
    }
}
