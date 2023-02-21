/**
 * Clase para manejar las entradas de un blog.
 *
 * @author Maria Teresa Rocamora
 * @version 2.3
 */
public class EntradaBlogMRC {

    /**
     * Separador es el ccarácter que separa ENTRADA DE del nombre del autor
     */
    public static char separador = ':';
    private final int id;
    private final String texto;
    private final String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     *
     * @param id El id de la entrada del blog
     * @param autor Autor de la entrada del blog
     * @param texto Contenido de la entrada del blog
     * @throws IllegalArgumentException El id no puede ser negativo
     */
    public EntradaBlogMRC(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) throw new IllegalArgumentException ("El id no puede ser negativo");
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Devuelve el número de la entrada
     *
     * @return Número de entrada
     */
    public int getId() {
        return this.id;
    }

    /**
     * Devuelve el texto completo de la entrada
     *
     * @return Texto completo de la enrtrada
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas
     *
     * @return Nombre del autor de la entrada en mayúsculas
     */
    public String getAutor() {
        return this.autor.toUpperCase ();
    }

    /**
     * Devuelve el nombre del autor.
     *
     * @deprecated Mejor ver {@link #getAutor() getAutor}
     * @return Nombre del autor.
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * Método principal del programa
     * @param args No tiene porqué tener argumentos.
     */
    public static void main(String[] args) {
        EntradaBlogMRC e1 = new EntradaBlogMRC (-3, "ana", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println (e1);
    }
}