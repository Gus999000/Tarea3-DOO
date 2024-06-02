package parte_lógica;
/**Clase Bebida
 * @author Gustavo Benítez
 * @version versión 1, 25 de abril 2024*/
public abstract class Bebida extends Producto {
    /**Constructor de la clase Bebida
     * @param nombre String
     * @param precio int*/
    public Bebida(String nombre, int precio) {
        super(nombre, precio);
    }
}