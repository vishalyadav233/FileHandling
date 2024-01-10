package p1;
import java.io.FileReader;
import java.io.BufferedReader;
// buffered reader is applied on the fileReader in the java  in the java file handling and bufferedreader is the mechanism of the reading the file
// contents from the file in the buffered memory space then the actual reading from the directly from the disk that why
// is increase the performance of the file reading and ultimetaly increse the performance in the file reading in the java 
public class K {
	public static void main (String args[]){
		
		try {
			FileReader fr = new FileReader("D:\\File_concept\\a.txt");
			BufferedReader br = new BufferedReader (fr);
			for ( int i = 0; i<20;i++) {
				System.out.print((char)br.read());
			}
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

	
	}


