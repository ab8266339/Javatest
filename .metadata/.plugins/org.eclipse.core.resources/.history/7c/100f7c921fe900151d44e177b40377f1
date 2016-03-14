package lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author sdn
 */
public class LineReader {
    //Instance variables
    private String line;
    private BufferedReader reader;

    //Constructor
    public LineReader (String fileName) throws IOException    {
        Path file = Paths.get(fileName);
        reader = Files.newBufferedReader(file);
        line = reader.readLine();        
    }

    //Constructor
    public LineReader (Path file) throws IOException    {
        reader = Files.newBufferedReader(file);
        line = reader.readLine();        
    }

    //Instance methods
    public boolean readEverything () {
        return line == null;
    }

    public String getLineAndReadNext() throws IOException  {
        String l = line;
        line = reader.readLine();         
        return l;
    }

    public void close() throws IOException   {        
        reader.close();         
   }

}
