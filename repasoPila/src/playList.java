import java.util.Stack;

public class playList {
    private Stack <Cancion> Pila;

  public playList (){
      Pila = new Stack<Cancion>();
  }

  public void add(Cancion c)
  {
      Pila.push(c);
  }

  public void eliminar(){
      Pila.pop();
  }

    public Stack<Cancion> getPila() {
        return Pila;
    }

    public void setPila(Stack<Cancion> pila) {
        Pila = pila;
    }
}