package parte_lógica;
/**Clase CocaCola
 * @author Gustavo Benítez
 * @version versión 2, 28 de abril 2024*/
public class CocaCola extends Bebida {
    /**Constructor de la clase CocaCola, parámetros recibidos de la enumeración Productos*/
    public CocaCola() {
        super(Productos.COCACOLA.getNombre(), Productos.COCACOLA.getPrecio());
    }
}