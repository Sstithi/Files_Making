import java.io.*;


public class FileExample1 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:/Users/showm/Documents/name1.txt"); 
		f1.createNewFile();
		System.out.println("Is exist :" + f1.exists());
	System.out.println("File size " + f1.length());
	System.out.println("File name:" + f1.getName());
	System.out.println("If file read " + f1.canWrite());
	System.out.println("If file write " + f1.canWrite());
	System.out.println("File path :" + f1.getPath());
	System.out.println("Get Directory " + f1.getParent());
	f1.delete();
	} 

}
