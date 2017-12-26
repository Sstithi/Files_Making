import java.io.*;

public class FileExample2 {
	public class FileExample3 {

	}

	public static void main(String[] args) throws IOException{
		FileOutputStream fout = new FileOutputStream ("C:/Users/showm/Documents/myfile.txt",true);
		String s = "TATA";
		char[]ch = s.toCharArray();
		for (int i =0;i<s.length();i++)
		{
			fout.write(ch[i]);
		
		}
	
		fout.close();
	}

}
