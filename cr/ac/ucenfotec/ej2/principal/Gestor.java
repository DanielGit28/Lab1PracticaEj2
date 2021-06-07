package cr.ac.ucenfotec.ej2.principal;

import cr.ac.ucenfotec.ej2.creador_concreto.Fabrica_Militantes;
import cr.ac.ucenfotec.ej2.producto.Militante;

import java.util.ArrayList;

public class Gestor {
    private static ArrayList<Militante> arrayMilitantes = new ArrayList<Militante>();
    private static Fabrica_Militantes gFabrica;

    /************************************************************
     * Metodo:		nuevoMilitante
     *
     * Descripción:	Esta funcion genera un nuevo militante llamando
     * 				a la fabrica.
     *
     * Parametros:	pNombre [String]
     *
     * @return:		Void
     *************************************************************/
    public void nuevoMilitante(String pNombre) {
        Fabrica_Militantes gFabrica = new Fabrica_Militantes();
        add_objeto_array(gFabrica.crearMilitante(pNombre));

    }

    /************************************************************
     * Metodo:		add_objeto_array
     *
     * Descripción:	Recibe un nuevo objeto y lo guarda en el array de militantes.
     *
     * Parametros:	pObj [Militante]
     *
     * @return:		Void
     *************************************************************/
    private static void add_objeto_array(Militante pObj) {
        arrayMilitantes.add(pObj);
    }

    /************************************************************
     * Metodo:		obtenerDatos
     *
     * Descripción:	Obtiene los datos de los militantes y los
     * 				devuelve en una variable.
     *
     * Parametros:	N/A
     *
     * @return:		mResult [String]
     *************************************************************/
    public String obtenerDatos() {
        String mResult = "";
        for (Militante mMil : arrayMilitantes)	{
            mResult = mResult + mMil.getNombre() + "\n"
                    +"Su ataque es de: " + mMil.getAtaque() + "\n"
                    +"Su defensa es de: " + mMil.getDefensa() + "\n"
                    +"Su estamina es de: " + mMil.getEstamina() + "\n"
                    +"Su curación es de: " + mMil.getCuracion() + "\n";

        }

        return mResult;

    }

}
