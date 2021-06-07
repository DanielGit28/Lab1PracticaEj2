package cr.ac.ucenfotec.ej2.creador_concreto;

import cr.ac.ucenfotec.ej2.creador.Metodo_Fabrica_Abstracta;
import cr.ac.ucenfotec.ej2.producto.Militante;
import cr.ac.ucenfotec.ej2.producto_concreto.Artillero;
import cr.ac.ucenfotec.ej2.producto_concreto.Doctor;
import cr.ac.ucenfotec.ej2.producto_concreto.Infanteria;
import cr.ac.ucenfotec.ej2.producto_concreto.Piloto;

public class Fabrica_Militantes implements Metodo_Fabrica_Abstracta {
    /**--Implementacion de funciones abstractas--**/
    @Override
    public Militante crearMilitante(String militante) {

        if(militante == "Piloto") {
            return  new Piloto();
        } else if(militante == "Doctor") {
            return  new Doctor();
        } else if(militante == "Infanteria") {
            return  new Infanteria();
        } else
            return new Artillero();
    }
}
