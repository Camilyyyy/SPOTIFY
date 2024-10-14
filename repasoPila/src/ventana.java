import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel txtTexto;
    private JTextField txtNombreCancion;
    private JLabel hh;
    private JTextField txtNombreAlbum;
    private JLabel h;
    private JTextField txtNombreAutor;
    private JCheckBox chbVerificado;
    private JButton btnAgregarCancion;
    private JButton btnBorrar;
    private JPanel panelEliminar;
    private JTextArea txtArea;
    private JButton btnActualizar;
    private JButton btnQuemar;
    private JButton REPRODUCIRButton;
    private JButton REGRESARButton;
    private JButton SIGUIENTEButton;
    private JLabel txtcancion;
    private JButton ENCOLARButton;
    private JButton COLADEREPRODUCCIONButton;
    private playList Conciertos = new playList();
    private ColaReproduccion Rep = new ColaReproduccion();

    private Cancion canciontemp;
    public ventana() {
        btnAgregarCancion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //agarrar lo de la interfaz
                String nombreCancion = txtNombreCancion.getText();
                String nombreAlbum = txtNombreAlbum.getText();
                String nombreAutor = txtNombreAutor.getText();
                Boolean verificado = chbVerificado.isSelected();
                //Crear objetos
                Autor autorTemporal = new Autor(nombreAutor, verificado);
                Album albumTemporal = new Album(nombreAlbum, autorTemporal);
                Cancion cancionTemporal = new Cancion(nombreCancion, albumTemporal);
                Conciertos.add(cancionTemporal);
                canciontemp = cancionTemporal;
                JOptionPane.showMessageDialog(null, "Cancion agregada :)");


            }
        });
        btnQuemar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quemar();
                JOptionPane.showMessageDialog(null,"Se quemo");
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conciertos.eliminar();
                JOptionPane.showMessageDialog(null, "Se elimino la cancion :(");
            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");

                for (Cancion cancion : Conciertos.getPila()){ //Recorre toda la pila(stack) llamada conciertos
                    txtArea.append(cancion.toString());//imprime dentro del text area los atributos del objeto cancion
                }
            }
        });
        REPRODUCIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rep.play();
                txtcancion.setText(Rep.conseguirnombre().getNombre());
            }
        });
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rep.next();
                txtcancion.setText(Rep.conseguirnombre().getNombre());
            }
        });
        ENCOLARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rep.agregar(canciontemp);
            }
        });
        COLADEREPRODUCCIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                encolaar();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventana");
        frame.setContentPane(new ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void Quemar(){
        String nc= "Shhh";
        String na="Sayonara";
        String nau="AD";
        boolean verifao= true;
        Conciertos.add(new Cancion(nc,new Album(na,new Autor(nau,verifao))));
        Conciertos.add(new Cancion("EN PR NO HACE FRIO", new Album("SAYONARA", new Autor("Alvaro Diaz",true))));
        Conciertos.add(new Cancion("YOKO", new Album("SAYONARA", new Autor("Alvaro Diaz",true))));
        Conciertos.add(new Cancion("QUIEN TE QUIERE COMO EL NENE", new Album("SAYONARA", new Autor("Alvaro Diaz",true))));
    }


    public void encolaar(){
        Rep.agregar(new Cancion("Posdata", new Album("jjj", new Autor("kkk", true))));
        Rep.agregar(new Cancion("Adan ", new Album("jj", new Autor("kk", true))));
        Rep.agregar(new Cancion("Eva", new Album("j", new Autor("k", true))));
    }


}
