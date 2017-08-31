import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    
    public Biblioteca(){
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    
    public void AgregaCancion(String nomCancion){
        canciones.add(nomCancion);
    }
    
    public void ReproducirCancion(int numCancion){
        reproductor.reproducir(canciones.get(numCancion));
    }
}