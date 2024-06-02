package parte_lógica;
/**Deposito de tipo genérico
 * @author Gustavo González
 * @version 2, 26 de abril de 2024*/
import java.util.ArrayList;
public class Deposito <T> {
    /**ArrayList para almacenar los objetos*/
    private ArrayList <T> items = new ArrayList<>();
    /**El constructor no es necesario*/
    public Deposito() {
    }
    /**Getter del Deposito, si el ArrayList (Deposito) esta vacío:
     * @return null
     * si el ArrayList no esta vacío:
     * @return el objeto en el index 0 y remueve ese mismo objeto del ArrayList*/
    public T get() {
        if (!items.isEmpty()) {
            return items.remove(0);
        }
        return null;
    }
    /**Añade un objeto del tipo <T> al Deposito
     * @param item T*/
    public void add(T item) {
        items.add(item);
    }
}