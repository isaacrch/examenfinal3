package progra1examen3_isaac_reyes_chavarria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsInventario {

    static ArrayList<String> codigo = new ArrayList<>();
    static ArrayList<Boolean> activo = new ArrayList<>();
    static ArrayList<Integer> cantidad = new ArrayList<>();
    static ArrayList<String> descripcion = new ArrayList<>();
    static int siactivo, noactivo;
    static int consecutivo;

    public ClsInventario() {
        consecutivo = 1;
        siactivo = 0;
        noactivo = 0;
    }

    public ClsInventario(String nombre) {
    }

    public static void Buscarcodigo(String Nombre) {

        Boolean encontrado = false;
        String activo = "No esta activo";
        for (int i = 0; i < ClsInventario.codigo.size(); i++) {

            if (ClsInventario.codigo.get(i).toLowerCase().equals(Nombre.toLowerCase())) {
                encontrado = true;
                if (ClsInventario.activo.get(i)) {
                    activo = "Si esta activo";
                }
                JOptionPane.showMessageDialog(null, "codigo: " + ClsInventario.codigo.get(i) + "\n\ncantidad " + ClsInventario.cantidad.get(i) + "\n\nactivo: " + activo);
                break;
            }

        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "NO existe");
        }
    }

   
    public static int getConsecutivo() {
        return consecutivo;
    }

    
    public void setConsecutivo() {
        ClsInventario.consecutivo++;
    }

    public void setsiactivo() {
        ClsInventario.siactivo++;
    }

    public void setnoactivo() {
        ClsInventario.noactivo++;
    }

    public static int getsiactivo() {
        return siactivo;
    }

    public static int getnoactivo() {
        return noactivo;
    }

    public void SetSalvarDatos(String Codigo, Boolean Activo, int Cantidad, String Descripcion) {
        codigo.add(Codigo);
        activo.add(Activo);
        cantidad.add(Cantidad);
        descripcion.add(Descripcion);
    }

}
