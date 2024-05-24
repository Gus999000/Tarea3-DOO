package parte_lógica;
/**El expendedor, encargado de crear los depositos hacer la compra y dar el vuelto (con los distintos casos incluidos)
 * @author Gustavo González
 * @version 6, 29 de abril 2024
 * @see PagoIncorrectoException
 * @see NoHayProductoException
 * @see PagoInsuficienteException*/
class Expendedor {
    /**Se crean los depositos de los objetos*/
    private Deposito <CocaCola> coca;
    private Deposito <Sprite> sprite;
    private Deposito <Fanta> fanta;
    private Deposito <Snickers> snickers;
    private Deposito <Super8> super8;
    private Deposito <Moneda> DepExp;
    private Deposito <Moneda> monVu;
    /**Números del depósito*/
    public static final int C1 = 1;
    public static final int S2 = 2;
    public static final int F3 = 3;
    public static final int S4 = 4;
    public static final int S85 = 5;
    /**El constructor llena "mágicamente" todos los depósitos de productos con la misma cantidad ingresada (numProductos) y llena el depósito de monedas con 20 monedas de 100
     * @param numProductos int*/
    public Expendedor(int numProductos) {
        this.coca = new Deposito <CocaCola>();
        this.sprite = new Deposito <Sprite>();
        this.fanta = new Deposito <Fanta>();
        this.snickers = new Deposito <Snickers>();
        this.super8 = new Deposito <Super8>();
        CocaCola C = new CocaCola();
        Sprite S = new Sprite();
        Fanta F = new Fanta();
        Snickers SS = new Snickers();
        Super8 S8 = new Super8();
        for (int i = 0; i < numProductos; i = i + 1) {
            coca.add(C);
            sprite.add(S);
            fanta.add(F);
            snickers.add(SS);
            super8.add(S8);
        }
        this.DepExp = new Deposito <Moneda>();
        this.monVu = new Deposito <Moneda>();
        Moneda100 MonExp = new Moneda100();
        for (int i = 0; i < 20; i = i + 1) {
            DepExp.add(MonExp);
        }
    }
    /**La función comprarProducto recibe una Moneda m y un int cual, luego crea variables para almacenar el precio, vuelto y el producto solicitado.
     * Se entra en un switch cuya función es la misma en los distintos casos, pero con los distintos productos disponibles.
     * Para cada caso saca el precio desde la enum Productos, luego saca el producto correspondiente.
     * Luego si la moneda no es null, compara su valor con el precio, si es igual devuelve el producto, si el valor de la moneda es mayor, calcula y deposita el vuelto en el depósito de vuelto y devuelve el producto.
     * @param m Moneda
     * @param cual int
     * @return el producto en cuestión
     * @throws PagoIncorrectoException puede arrojar esta excepción si se intenta pagar con una moneda null
     * @throws NoHayProductoException puede arrojar esta excepción si el número del depósito es erróneo, no hay producto o no alcanza
     * @throws PagoInsuficienteException puede arrojar esta excepción si se quiere comprar un producto por un valor inferior al precio*/
    public Producto comprarProducto(Moneda m, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (m == null) {
            throw new PagoIncorrectoException("La moneda es nula");
        }
        int precio = 0;
        int vuelto = 0;
        Producto X = null;
        switch (cual) {
            case 1: precio = Productos.COCACOLA.getPrecio();
                X = coca.get();
                if (X == null) {
                    monVu.add(m);
                    throw new NoHayProductoException("No hay producto");
                }
                if(precio == m.getValor()) {
                    return X;
                }
                else if (precio < m.getValor()) {
                    vuelto = m.getValor() - precio;
                    while (100 == vuelto || 100 < vuelto) {
                        monVu.add(DepExp.get());
                        vuelto = vuelto - 100;
                    }
                    return X;
                }
                else if(m.getValor() < precio) {
                    monVu.add(m);
                    X = null;
                    throw new PagoInsuficienteException("No alcanza");
                }
                break;
            case 2: precio = Productos.SPRITE.getPrecio();
                X = sprite.get();
                if (X == null) {
                    monVu.add(m);
                    throw new NoHayProductoException("No hay producto");
                }
                if(precio == m.getValor()) {
                    return X;
                }
                else if (precio < m.getValor()) {
                    vuelto = m.getValor() - precio;
                    while (100 == vuelto || 100 < vuelto) {
                        monVu.add(DepExp.get());
                        vuelto = vuelto - 100;
                    }
                    return X;
                }
                else if(m.getValor() < precio) {
                    monVu.add(m);
                    X = null;
                    throw new PagoInsuficienteException("No alcanza");
                }
                break;
            case 3: precio = Productos.FANTA.getPrecio();
                X = fanta.get();
                if (X == null) {
                    monVu.add(m);
                    throw new NoHayProductoException("No hay producto");
                }
                if(precio == m.getValor()) {
                    return X;
                }
                else if (precio < m.getValor()) {
                    vuelto = m.getValor() - precio;
                    while (100 == vuelto || 100 < vuelto) {
                        monVu.add(DepExp.get());
                        vuelto = vuelto - 100;
                    }
                    return X;
                }
                else if(m.getValor() < precio) {
                    monVu.add(m);
                    X = null;
                    throw new PagoInsuficienteException("No alcanza");
                }
                break;
            case 4: precio = Productos.SNICKERS.getPrecio();
                X = snickers.get();
                if (X == null) {
                    monVu.add(m);
                    throw new NoHayProductoException("No hay producto");
                }
                if(precio == m.getValor()) {
                    return X;
                }
                else if (precio < m.getValor()) {
                    vuelto = m.getValor() - precio;
                    while (100 == vuelto || 100 < vuelto) {
                        monVu.add(DepExp.get());
                        vuelto = vuelto - 100;
                    }
                    return X;
                }
                else if(m.getValor() < precio) {
                    monVu.add(m);
                    X = null;
                    throw new PagoInsuficienteException("No alcanza");
                }
                break;
            case 5: precio = Productos.SUPER8.getPrecio();
                X = super8.get();
                if (X == null) {
                    monVu.add(m);
                    throw new NoHayProductoException("No hay producto");
                }
                if(precio == m.getValor()) {
                    return X;
                }
                else if (precio < m.getValor()) {
                    vuelto = m.getValor() - precio;
                    while (100 == vuelto || 100 < vuelto) {
                        monVu.add(DepExp.get());
                        vuelto = vuelto - 100;
                    }
                    return X;
                }
                else if(m.getValor() < precio) {
                    monVu.add(m);
                    X = null;
                    throw new PagoInsuficienteException("No alcanza");
                }
                break;
            default: monVu.add(m);
                throw new NoHayProductoException("El número de depósito es erróneo");
        }
        return X;
    }
    /**Getter del vuelto, saca una moneda del depósito de vuelto
     * @return una moneda del depósito de vuelto*/
    public Moneda getVuelto() {
        return monVu.get();
    }
}