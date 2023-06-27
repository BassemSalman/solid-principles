package OpenClosed;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        * Suppose we have multiple shapes
        * could be any type of shape
        */

        /*
         * Left unchanged whatever number of shapes i added
         */
        List<Shape> shapes = new ArrayList<>();
        for(Shape s : shapes){
            s.draw();

            // instead of:
            // if(s instanceof Circle) .. 
            // if(s instanceof Rectangle) ..
        }
    }
}
