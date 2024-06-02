package parte_lógica;
/**Clase Fanta
 * @author Gustavo Benítez
 * @version versión 2, 28 de abril 2024*/
public class Fanta extends Bebida {
    /**Constructor de la clase Fanta, parámetros recibidos de la enumeración Productos*/
    public Fanta() {
        super(Productos.FANTA.getNombre(), Productos.FANTA.getPrecio());
    }
}