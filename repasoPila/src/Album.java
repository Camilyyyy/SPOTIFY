public class Album {
    public String name;
    public Autor autor;

    public Album(String name, Autor autor) {
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Album: " +
                "name: " + name +
                "autor: " + autor +
                '\n';
    }
}
