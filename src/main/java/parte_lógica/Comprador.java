package parte_lógica;
/**Clase Comprador
 * @author Gustavo González
 * @version 3, 29 de abril 2024
 * @see PagoIncorrectoException
 * @see NoHayProductoException
 * @see PagoInsuficienteException*/
class Comprador {
    /**String que almacena el sabor del producto*/
    private String saborProducto;
    /**Valor int que almacena el vuelto recibido*/
    private int vuelto = 0;
    /**Constructor de la clase Comprador
     * El comprador recibe una moneda m, el número del producto a comprar y el expendedor donde lo va a comprar
     * Se compra el producto con la función y se guarda el valor en P
     * Si P es distinto de null, le asigna a saborProducto el valor correspondiente con getNombre
     * Luego, saca las monedas del depósito de vuelto del expendedor y suma sus valores (100)
     * @param m Moneda
     * @param numProducto int
     * @param exp Expendedor
     * @throws PagoIncorrectoException puede arrojar esta excepción si se intenta pagar con una moneda null
     * @throws NoHayProductoException puede arrojar esta excepción si el número del depósito es erróneo, no hay producto o no alcanza
     * @throws PagoInsuficienteException puede arrojar esta excepción si se quiere comprar un producto por un valor inferior al precio*/
    public Comprador(Moneda m, int numProducto, Expendedor exp) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Producto P = exp.comprarProducto(m, numProducto);
        this.saborProducto = P != null ? P.getNombre() : "null";
        int V = 0;
        while(exp.getVuelto() != null) {
            V = V + 100;
        }
        this.vuelto = V;
    }
    /**Getter del sabor del producto, equivalente a preguntarle que comió
     * @return el sabor del producto*/
    public String getSaborProducto() {
        return saborProducto;
    }
    /**Getter de la cantidad total del vuelto
     * @return cantidad total del vuelto*/
    public int getVuelto() {
        return vuelto;
    }
}