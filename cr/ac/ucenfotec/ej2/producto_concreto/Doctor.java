package cr.ac.ucenfotec.ej2.producto_concreto;

import cr.ac.ucenfotec.ej2.producto.Militante;

public class Doctor extends Militante {

    /* int ataque, int defensa, int estamina, int curacion*/
    public Doctor() {
        setAtaque(2);
        setDefensa(5);
        setEstamina(3);
        setCuracion(5);
        setNombre("Doctor");
    }
}
