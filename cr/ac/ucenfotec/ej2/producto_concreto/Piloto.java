package cr.ac.ucenfotec.ej2.producto_concreto;

import cr.ac.ucenfotec.ej2.producto.Militante;

public class Piloto extends Militante {

    /* int ataque, int defensa, int estamina, int curacion*/
    public Piloto() {
        setAtaque(1);
        setDefensa(3);
        setEstamina(5);
        setCuracion(1);
        setNombre("Piloto");
    }
}
