package parte_lógica;
/**Clase de enumeración Productos
 * @author Gustavo González
 * @version versión 2, 28 de abril 2024*/
public enum Productos {
    /**Constantes de la enumeración (productos disponibles)*/
    COCACOLA("CocaCola", 1000),
    SPRITE("Sprite", 800),
    FANTA("Fanta", 600),
    SNICKERS("Snickers", 500),
    SUPER8("Super8", 300);
    /**Nombre del producto*/
    private final String nombre;
    /**Precio del producto*/
    private final int precio;
    /**Constructor de Productos
     * @param nombre String
     * @param precio int*/
    Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**Getter del nombre del producto
     * @return el nombre del producto*/
    public String getNombre() {
        return nombre;
    }
    /**Getter del precio del producto
     * @return el precio del producto*/
    public int getPrecio() {
        return precio;
    }
}