package ejercicios_semana_5_P2.ejercicio_guiado_s5;
public class AppStore {
    private static final int MAX = 4;
    private Juego juegos[];
    private int indice;

    public AppStore(){
        juegos = new Juego[MAX];
        indice = -1;
    }

    public int getIndice() {
        return indice;
    }

    public void cargarDatos(){
        // Se cargan 3 juegos para dejar 1 espacio libre en el arreglo (MAX = 4)
        agregarJuego(new Juego("League of Legends", "MOBA", 12000, 9.99, 50));
        agregarJuego(new Juego("Dota 2", "MOBA", 35000, 14.99, 30));
        agregarJuego(new Juego("Geometry Dash", "Plataformas", 250, 3.99, 100));
    }

    public Juego[] getJuegos() {
        return juegos;
    }

    public boolean agregarJuego(Juego j){
        if(j != null && indice < MAX -1){
            juegos[++indice] = j;
            return true;
        }
        return false;
    }

    public Juego buscarJuego(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            for(int i = 0; i <= indice; i++){
                if(juegos[i].getNombre().equalsIgnoreCase(nombre)){
                    return juegos[i];
                }
            }
            return null;
        }
        return null;
    }

    public boolean comprar(String nombre, int cantidad){
        if(nombre != null && !nombre.trim().isEmpty() && cantidad > 0){
            Juego j = buscarJuego(nombre);
            if(j != null){
                return j.comprar(cantidad);
            }
        }
        return false;
    }

    public double vender(String nombre, int cantidad){
        Juego j = buscarJuego(nombre);
        if(j != null){
            if (j.vender(cantidad)) {
                return j.getPrecio() * cantidad;
            }else{
                return 0;
            }
        }
        return 0;
    }

    public String masVendido(){
        String nombre = "";
        int mayor;
        if(indice >= 0){
            nombre = juegos[0].getNombre();
            mayor = juegos[0].getLicenciasVendidas();
            for(Juego j : juegos){
                if(j != null){
                    if(j.getLicenciasVendidas() > mayor){
                        nombre = j.getNombre();
                        mayor = j.getLicenciasVendidas();
                    }
                }else{
                    return nombre;
                }
            }
        }
        return nombre;
    }
}