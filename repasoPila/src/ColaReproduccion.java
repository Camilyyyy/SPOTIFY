import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ColaReproduccion{

    private Queue <Cancion> cola;

    public ColaReproduccion() {
        cola=new LinkedList<Cancion>();
    }


    public void agregar (Cancion c){
        cola.add(c);
    }

    public void next (){
        if(cola.isEmpty()) {
            JOptionPane.showMessageDialog(null, "no hay nada en la cola");
        }
        else {
            cola.poll();
        }

    }

    public void play (){
        if (cola.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Esta vacia la colaaaa :(");
        }
        else {
            cola.peek();
        }
    }

    public Cancion conseguirnombre(){
      Cancion actual=cola.peek();
        return actual;
    }


}
