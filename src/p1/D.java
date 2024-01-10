// read( ) = this is the non staic method present inside the file class in the java IO package the is used to read the file contents in the java 
package p1;
import java.io.File;
import java.io.FileReader;
public class D{
	public static void main(String[] args) {
		try {                    
			File f = new File ("D:\\File_concept\\a.txt");
			FileReader fr = new FileReader ( f);
			for ( int i = 0;i<f.length();i++){
				System.out.print((char)fr.read());
				
			}
			fr.close();// this is mandatory that close the file after reading the file contents which is the Good practice in the java 

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}