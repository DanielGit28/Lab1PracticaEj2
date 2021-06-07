package cr.ac.ucenfotec.ej2.producto_concreto;

import cr.ac.ucenfotec.ej2.producto.Militante;

public class Infanteria extends Militante {
    /* int ataque, int defensa, int estamina, int curacion*/
    public Infanteria() {
        setAtaque(5);
        setDefensa(5);
        setEstamina(3);
        setCuracion(0);
        setNombre("Infantería");
    }
}
