import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericStackTest {

    private GenericStack<String> testStack;

    @BeforeEach
    void setUp() {
        testStack = new GenericStack<String>();
    }

    @AfterEach
    void tearDown() {
        testStack = null;
    }

    @Test
    void push() {
        /**
         * first push and then pop an object to check the
         * push method
         * adds the object to the stack properly.
         */
        testStack.push("Test String");
        assertEquals("Test String", testStack.pop());
    }

    @Test
    void pop() {
        /**
         * first push and then pop an object to check the
         * pop method
         * returns the right object.
         */
        testStack.push("Test String");
        assertEquals("Test String", testStack.pop());

    }

    @Test
    void isEmpty() {
        /**
         * Adding an object to check for un-empty stack.
         */
        testStack.push("Test String");
        assertFalse(testStack.isEmpty());


        /**
         * Poping an object to check for empty stack.
         */
        testStack.pop();
        assertTrue(testStack.isEmpty());

    }
}
