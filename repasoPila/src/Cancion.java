import java.util.ArrayList;
import java.util.List;

public class Cancion {
    private String nombre;
    private List <Autor> Autores; //una lista
    private Album album;


    public Cancion(String nombre, Album album) {
        this.nombre = nombre;
        this.album = album;
        Autores = new ArrayList<Autor>(); //inicializar una lista
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return Autores;
    }

    public void setAutores(List<Autor> autores) {
        Autores = autores;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Cancion: " +
                "Nombre: " + nombre +
                "Autores: " + Autores.toString() +
                "Album=" + album.toString() +
                '\n';
    }
}
