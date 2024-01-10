package p1;
import java.io.FileWriter;
// fileWriter creates files again when its run the code and replace s the default in the already present in the java 
// there are three ways to write anything in the inside the files in the  java file handling in the java 
// Fw.write(100) // this is treated as the character in the FileWriter Concept
// Fw.write("vishal")// his is treated as the String in the 
// char [] ch = {'v','i','s','h','l',}

public class M {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\File_concept\\A.txt",true);
			fw.write("100");
			fw.write("Vishal Yadav");
			fw.write("Oustanding perforance in the java ");
			fw.close();
			
			
		}catch (Exception e ) {
			e.printStackTrace();
		}
		
	}
}