package InterfaceSegregation;

public class Document implements Printable{ // Printer {
    public void print() {
        // Print document
        // ...
    }

/*
 * Suppose edit() isnt needed in document, why implement it??
 * => split Printer into Editable and Printable
 */
    // public void edit() {
    //     // Edit document
        
    // }
}
