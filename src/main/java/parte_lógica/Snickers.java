package parte_lógica;
/**Clase Snickers
 * @author Gustavo Benítez
 * @version versión 2, 28 de abril 2024*/
class Snickers extends Dulce {
    /**Constructor de la clase Snickers, parámetros recibidos de la enumeración Productos*/
    public Snickers() {
        super(Productos.SNICKERS.getNombre(), Productos.SNICKERS.getPrecio());
    }
}