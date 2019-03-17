import java.util.*;

public class GenericStack<Object>{

    /**
     * top contains the position of top object of the stack
     *
     */
    private int top;


    /**
     * stackObjects contains the objects of the stack
     *
     */
    private ArrayList<Object> stackObjects;

    /**
     * Creates an empty Stack and Initializes the stack variables
     *
     */
    public GenericStack() {
        this.top = 0;
        stackObjects = new ArrayList<Object> ();
    }

    /**
     * Inserts an object on top of the Stack.
     *
     * @param X the item to be inserted
     */
    public void push (Object X){
        stackObjects.add(top++, X);
    }

    /**
     * Removes the last object from the stack
     * and returns the object
     *
     * @return The item removed from the top of the stack.
     * @throws RuntimeException if the stack is empty.
     */
    public Object pop (){
        if(top == 0)
            throw new RuntimeException("No object found in the stack to pop");
        return stackObjects.remove (--top);

    }

    /**
     * Check if this stack is empty.
     * @return false if the stack has at least one object; true, otherwise.
     */
    public boolean isEmpty (){
        return stackObjects.isEmpty();
    }


}
