package lecture5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author sdn
 */
public class OutputTest {
    
    public static void main (String [] args ) throws IOException  {
        Path file = Paths.get("output.txt");
        
        if  (  Files.exists(file)   )   {
            BufferedWriter writer = Files.newBufferedWriter(file);        
            writer.write("Hello world ");
            writer.newLine();
            writer.write("The answer to the Ultimate Question of Life, "+
                    "The Universe, and Everything is ");
            writer.write(String.valueOf(42)); 
            writer.newLine();
            writer.close();

            LineReader reader = new LineReader(file);
            while (  ! reader.readEverything()  )  
                System.out.println(reader.getLineAndReadNext());

        }     
        else 
            System.out.println("\"output.txt\" does not exist");
    }
    
}
