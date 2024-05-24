package parte_lógica;
/**Clase Super8
 * @author Gustavo Benítez
 * @version versión 2, 28 de abril 2024*/
class Super8 extends Dulce {
    /**Constructor de la clase Super8, parámetros recibidos de la enumeración Productos*/
    public Super8() {
        super(Productos.SUPER8.getNombre(), Productos.SUPER8.getPrecio());
    }
}