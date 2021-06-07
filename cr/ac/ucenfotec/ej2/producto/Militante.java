package cr.ac.ucenfotec.ej2.producto;

public abstract class Militante {
    private String nombre;
    private int ataque;
    private int defensa;
    private int estamina;
    private int curacion;

    /**-CONSTRUCTORES-**/
    public Militante(String nombre, int ataque, int defensa, int estamina, int curacion) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.estamina = estamina;
        this.curacion = curacion;
    }

    public Militante() {
        setAtaque(0);
        setDefensa(0);
        setEstamina(0);
        setCuracion(0);
        setNombre("Militante");
    }

    /**--GETS--**/
    public String getNombre() {
        return nombre;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getEstamina() {
        return estamina;
    }

    public int getDefensa() {
        return defensa;
    }
    public int getCuracion() {
        return curacion;
    }
    /**--SETS--**/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }
}
