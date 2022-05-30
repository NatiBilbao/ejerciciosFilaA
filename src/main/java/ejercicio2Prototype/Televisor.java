package ejercicio2Prototype;

public class Televisor implements ITelevisor{
    private String sistemaOperativo;
    private String versionSistemaOperativo;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serialTelevisor;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(String versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerialTelevisor() {
        return serialTelevisor;
    }

    public void setSerialTelevisor(String serialTelevisor) {
        this.serialTelevisor = serialTelevisor;
    }

    public void showInfo(){
        System.out.println("Sistema Operativo: " + this.getSistemaOperativo());
        System.out.println("Version Sistema operativo: " + this.getVersionSistemaOperativo());
        System.out.println("Pulgadas: " + this.getPulgadas());
        System.out.println("Resolucion: " + this.getResolucion());
        System.out.println("Puerto HDMI: " + this.isPuertoHDMI());
        System.out.println("Puertos USB: " + this.getPuertosUSB());
        System.out.println("Control Remoto: " + this.isControlRemoto());
        System.out.println("Bluetooth: " + this.isBluetooth());
        System.out.println("Serial Televisor: " + this.getSerialTelevisor());
    }

    @Override
    public Televisor clone() {
        Televisor televisorClone = new Televisor();
        televisorClone.setSistemaOperativo(this.getSistemaOperativo());
        televisorClone.setVersionSistemaOperativo(this.getVersionSistemaOperativo());
        televisorClone.setPulgadas(this.getPulgadas());
        televisorClone.setResolucion(this.getResolucion());
        televisorClone.setPuertoHDMI(this.isPuertoHDMI());
        televisorClone.setPuertosUSB(this.getPuertosUSB());
        televisorClone.setControlRemoto(this.isControlRemoto());
        televisorClone.setBluetooth(this.isBluetooth());
        televisorClone.setSerialTelevisor(this.getSerialTelevisor());
        return televisorClone;
    }
}
