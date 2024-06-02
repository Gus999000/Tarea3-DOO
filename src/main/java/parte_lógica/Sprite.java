package parte_lógica;
/**Clase Sprite
 * @author Gustavo Benítez
 * @version versión 2, 28 de abril 2024*/
public class Sprite extends Bebida {
    /**Constructor de la clase Sprite, parámetros recibidos de la enumeración Productos*/
    public Sprite() {
        super(Productos.SPRITE.getNombre(), Productos.SPRITE.getPrecio());
    }
}