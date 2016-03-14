package lecture5;

import java.io.IOException;

/**
 *
 * @author sdn
 */
public class FileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        LineReader file = new LineReader("people.txt");

        while (  ! file.readEverything()  ) {
            String [] lineSplit = file.getLineAndReadNext().split("\t");
            System.out.println(new Person(lineSplit[0], lineSplit[1], lineSplit[2]));
        }
        
        file.close();
    }

}
