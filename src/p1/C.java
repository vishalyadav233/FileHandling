// list is the non static method present inside the File class that i used
// to print the all the Files  and folder presents at the fiven path in the  java File handling 
package p1;

import java.io.File;

public class C {
	public static void main(String[] args) {
		File f = new File ("D:\\File_concept\\");
		String [] names = f.list();
		for (String string : names) {
			System.out.println(string);
			
		}
		
	}
}