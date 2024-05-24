package parte_lógica;
/**Clase Producto
 * @author Gustavo Benítez
 * @version versión 1, 25 de abril 2024*/
abstract class Producto {
    /**Nombre del producto*/
    private String nombre;
    /**Precio del producto*/
    private int precio;
    /**Constructor de la clase Producto
     * @param nombre String
     * @param precio int*/
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    /**Getter del nombre del producto
     * @return nombre del producto*/
    public String getNombre() {
        return nombre;
    }
    /**Getter del precio del producto
     * @return precio del producto*/
    public int getPrecio() {
        return precio;
    }
}