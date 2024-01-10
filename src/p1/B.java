package p1;
// mk dir() = this is the non statci method present inside the file class that used to make the folder  at the given path 
// Direction 
import java.io.File;
public class B {
	public static void main(String[] args) {
		File f = new File ( "D:\\File_concept\\p4");
		File f1 = new File ( "D:\\File_concept\\p5");
		
		Boolean val = f.mkdir();
		Boolean val1 = f1.mkdir();
		System.out.println(val);
		System.out.println(val1);
		
		
	}
}

	
	


