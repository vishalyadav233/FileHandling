package p1;
import java.io.File;
// length() = this is the non static method present inside the File class in the java whose return type 
// is the long and it count all the character and the white Space presents in the file given Path 
// location in the java 

public class A {
	public static void main(String[] args) {
		File  f = new File ("D:\\File_concept\\A.txt");
		long val = f.length();
		System.out.println(val);
		}
}
// length () = this is the non  static method present inside the File class in the java that provide the
// methods to count all the white space and the character presents inside the files at the file p ath location 
// whose return types in the java is the long in the java . this method not only count the charchter presents inso=ide the 
// the file but Also white space in the file 