public class Autor {
    private String name;
    private boolean verificado;

    public Autor(String name, boolean verificado) {
        this.name = name;
        this.verificado = verificado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    @Override
    public String toString() {
        return "Autor:" +
                "name:" + name +
                "Verificado=" + verificado;
    }
}
