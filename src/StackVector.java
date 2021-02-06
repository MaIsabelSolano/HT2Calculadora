//Es la clase que se encontraba en canvas

public interface Stack<E>
{

    /**
     *
     * @param item
     */
    public void push(E item);

    /**
     * pre: stack not empty
     * @return valor arriba del stack y lo elimina
     */
    public E pop();

    /**
     * pre: stack not empty
     * @return valor arriba del stack
     */
    public E peek();


    /** Determina si está vacío o no
     *
     * @return true si está vacío y false si no lo está
     */
    public boolean empty();

    /**
     *
     * @return int con la cantidad del elementos en el stack
     */
    public int size();

}
