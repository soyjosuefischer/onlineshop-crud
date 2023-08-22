package Main;

import Controlador.ControladorProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.FormularioProducto;

public class Main {

    public static void main(String[] args) {

        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        FormularioProducto formulario = new FormularioProducto();

        ControladorProducto ctrl = new ControladorProducto(mod, modC, formulario);
        ctrl.iniciar();
        formulario.setVisible(true);
    }
}