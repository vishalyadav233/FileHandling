package p1;
import java.io.FileWriter;
// FileWriter is the one of the method in the File Handling in the java that is 
// used to write something in the file in the given file Path Location 
// FileWriter in the java when run make the new File and Replaces th default one in the java 
//File Writer in the java is used to make the new File when the program is the run and the 
// create the new File and the 

public class AA{
	public static void main(String[] args) {
		try {
			FileWriter Fw = new FileWriter("D:\\File_Concept\\H.txt" ,true);
			Fw.write(97);
			Fw.write("Vishal Yadav");
			char [] ch = {'v','i','s','h','a','l'};
			Fw.write(ch);
			
			Fw.close();
			
			
			
			
			
			
			
		}catch(Exception e ) {
			
		}
		
	}      
	
}
