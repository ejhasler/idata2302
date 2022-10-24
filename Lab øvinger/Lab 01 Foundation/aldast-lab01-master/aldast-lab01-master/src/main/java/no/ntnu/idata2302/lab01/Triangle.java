package no.ntnu.idata2302.lab01;


/**
 * Represents a class that prints and Triangle in String for "X"
 */
public class Triangle {


    /**
     * Draw a triangle with the given height using the given buffer.
     */
    public static void createTriangle (int height,
                                       StringBuffer buffer) {
        if (height <= 0){
            String message = "Error: Negative height";
            throw new IllegalArgumentException(message);
        }

        int sideWidth = height - 1;
        for(int eachRow = 0; eachRow < height; eachRow++){

            // Computes the padding, that is the number
            // of white spaces I need before the actual
            //triangle starts.
            int padding = sideWidth - eachRow;

            // Triangle made of Three parts.
            // The left side "X"
            // The central side "X"
            // The right side "X"
            // and the new line.
            for(int i = 0; i < padding; i++) {
                buffer.append(" ");
            }

            for(int i = 0; i < eachRow; i++){
                buffer.append("X");
            }
            buffer.append("X");

            for(int i = 0; i < eachRow; i++){
                buffer.append("X");
            }
            buffer.append("\n");
        }
    }


    /**
     * This main program can help you debug your program
     */
    public static void main(String[] args) {
        int height = 10;
        if (args.length > 0) {
            try {
                height = Integer.parseInt(args[0]);
            } catch (Exception error) {
                System.out.println("Unable to read height from '" + args[0] + "'");
            }
        }

        StringBuffer buffer = new StringBuffer();
        createTriangle(height, buffer);
        System.out.print(buffer.toString());
    }

}
