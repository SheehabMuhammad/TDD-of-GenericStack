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

    }
    /**
     * Removes the last object from the stack
     * and returns the object
     *
     * @return The item removed from the top of the stack.
     */

    /*
    public Object pop (){
        return Object;
    }*/

    public boolean isEmpty (){
        return true;
    }


}
