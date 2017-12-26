/* Buffered Writer passes the arguments with the object of Writer class, 
 FileWriter is a sub class of writer class 
 Writer and FileWriter has the arguments to pass a string directing to the file path
 and a boolean which can append if needed.
 */
import java.io.*;

public class FileExample4 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter ("C:/Users/showm/Documents/file.txt",true);
		BufferedWriter bf = new BufferedWriter (fw);
		bf.write("Computer");
		bf.close();
		
		
	}

}
