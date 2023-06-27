package LiskovSubstitution;

public class Vector<E> extends CustomList<E>{

/*
 * The reason you cannot directly use E[] instead of Object[] is due to type erasure in Java's generics.
 * Java's generics use type erasure to ensure backward compatibility with older versions of Java that did not support generic
 */

    private Object[] arr;
    private int nbElements;
    
    public Vector(){
        // arr = new E[10];
        arr = new Object[10];
        nbElements = 0;
    }

    @Override
    public void add(E e) {
        if(nbElements == arr.length){
            // resize(); logic ...
        }
        arr[nbElements-1] = e;
    }
    
}
