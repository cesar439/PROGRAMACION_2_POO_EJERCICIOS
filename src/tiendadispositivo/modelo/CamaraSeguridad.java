package tiendadispositivo.modelo;

public class CamaraSeguridad extends Dispositivo {
    private int resolucion;

    public CamaraSeguridad(int codigo, String marca, int resolucion) {
        super(codigo, marca);
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }
    public boolean grabarVideo(){
        if(isEstado()){
            return true;
        }
        return false;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +"\nResolución: "+resolucion;
    }
}