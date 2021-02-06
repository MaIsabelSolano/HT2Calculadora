import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackVectorTest {

    @Test
    void push() {
        StackVector<Float> sv = new StackVector<Float>();
        char c = 4;
        sv.push((float)c);
        assertEquals(4.0f, sv.peek());
    }

    @Test
    void pop() {
        StackVector<Float> sv = new StackVector<Float>();
        char c = 4;
        sv.push((float)c);
        float f = sv.pop();
        assertTrue(sv.empty()); //Sí lo elimina
        assertEquals(4.0,f); //Sí lo devuleve
    }

    @Test
    void peek() {
        StackVector<Float> sv = new StackVector<Float>();
        char c = 4;
        sv.push((float)c);
        assertEquals(4.0f,sv.peek());
    }

    @Test
    void size() {
        StackVector<Float> sv = new StackVector<Float>();
        sv.push(45.0f);
        assertEquals(1,sv.size());
    }

    @Test
    void empty() {
        StackVector<Float> sv = new StackVector<Float>();
        sv.push(45.0f);
        assertFalse(sv.empty());
    }

    @Test
    void Spain() {
        StackVector<Float> sv = new StackVector<Float>();
        char c = '2';
        float f = (float)c;
        sv.push(f);
        System.out.println("pase por agregar añadiendo "+f);
        System.out.println("y se agrego "+sv.peek());
        assertEquals(2,sv.peek());

    }
}