package tiendadispositivo.modelo;

public class Dispositivo {
    private int codigo;
    private String marca;
    private boolean estado;

    public Dispositivo(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
        estado = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public String apagar(){
        if(estado){
            estado = false;
            return "El dispositivo se ha apagado";
        }
        return "El dispositivo ya se encontraba apagado";
    }
    public String prender(){
        if(estado == false){
            estado = true;
            return "El dispositivo ha sido prendido";
        }
        return "El dispositivo ya se encontraba encendido";
    }
    public String mostrarInformacion(){
        String estadoS = estado?"Prendido": "Apagado";
        return "Codigo: "+codigo+"\nMarca: "+marca+"\nEstado: "+estadoS;
    }
}