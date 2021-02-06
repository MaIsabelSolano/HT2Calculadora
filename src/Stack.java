//Es la clase que se encontraba en canvas

import java.util.ArrayList;

public class StackVector<E>
        implements Stack<E>
{
    protected ArrayList<E> data;

    /**
     * Construye el stack vacío
     */
    public StackVector()

    {
        data = new ArrayList<E>();
    }

    /**
     * post:post: the value is added to the stack
     *          will be popped next if no intervening push
     * @param item
     */
    public void push(E item)
    {
        data.add(item);
    }

    /**
     * pre: pre: stack is not empty
     * post: most recently pushed item is removed and returned
     * @return  E
     */
    public E pop()
    {
        return data.remove(size()-1);
    }

    /**
     * pre: stack is not empty
     * post: top value (next to be popped) is returned
     * @return E
     */
    public E peek()
    {
        return data.get(size() - 1);
    }

    /**
     * post: returns the number of elements in the stack
     * @return int
     */
    public int size()
    {
        return data.size();
    }

    /**
     * post: returns true if and only if the stack is empty
     * @return boolean
     */
    public boolean empty()
    {
        return size() == 0;
    }
}
