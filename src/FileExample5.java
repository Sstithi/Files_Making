import java.io.*;

public class FileExample5 {
public static void main(String[] args) throws IOException {
	BufferedReader  b = new BufferedReader(new FileReader("C:/Users/showm/Documents/sample.txt"));
	//String s;
	/* while ((s =b.readLine())!=null)// String readLine();
	{
	System.out.println(s);
	}
	*/
	char[]s = new char[20];
	 b.read(s,0,15);
	 System.out.println(s);
	
	b.close();


	
}
}
