package parte_lógica;
/**Clase de enumeración Productos
 * @author Gustavo González
 * @version versión 2, 28 de abril 2024*/
public enum Productos {
    /**Constantes de la enumeración (productos disponibles)*/
    COCACOLA(1, "CocaCola", 1000),
    SPRITE(2, "Sprite", 800),
    FANTA(3, "Fanta", 600),
    SNICKERS(4, "Snickers", 500),
    SUPER8(5, "Super8", 300);
    /**N es para la selección del producto*/
    private final int N;
    /**Nombre del producto*/
    private final String nombre;
    /**Precio del producto*/
    private final int precio;
    /**Constructor de Productos
     * @param nombre String
     * @param precio int*/
    Productos(int N, String nombre, int precio) {
        this.N = N;
        this.nombre = nombre;
        this.precio = precio;
    }
    /**Getter de N
     * @return N*/
    public int getN() {
        return N;
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