import java.io.*;

public class FileExample3 {
	public static void main(String[] args) throws IOException {
		int c;
		FileInputStream fin = new FileInputStream("C:/Users/showm/Documents/myfile.txt");
		
		
	
do {
	c = fin.read();
	if (c!= -1)
		System.out.print((char)c);
	
}
while (c!=-1);
fin.close();
}

}
