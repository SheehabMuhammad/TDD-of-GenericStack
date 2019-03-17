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
        
    }

    @Test
    void push() {

    }

    @Test
    void pop() {

    }

    @Test
    void isEmpty() {
        assertEquals(true, testStack.isEmpty());
    }
}
