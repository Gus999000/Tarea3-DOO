package parte_lógica;
/**Clase Moneda
 * @author Gustavo González
 * @version versión 3, 28 de abril 2024*/
abstract class Moneda implements Comparable <Moneda> {
    /**Las monedas no tienen propiedades, el valor es retornando directamente el número*/
    public Moneda() {
    }
    /**Getter del valor*/
    public abstract int getValor();
    /**Getter de la serie de la moneda
     * @return "this"*/
    public Moneda getSerie() {
        return this;
    }
    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
    @Override
    public String toString() {
        return "Moneda de " + this.getValor();
    }
}