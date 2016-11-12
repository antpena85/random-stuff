package stuff;

import java.util.Arrays;
import java.util.List;

public class JustAMain {

	public static void main(String[] args) {
		System.out.println("This is just a main and location where I will initialize other classes");
		
		String x = "Hi";
		
		String s = new String(x);
		
		System.out.println(x==s); //should return false
		System.out.println(x.equals(s));//should return true
		
		System.out.println("------------------------------------------------------------------------------------");
		
		String[] stringArray = {"I","have","two","daughters","named","Annali","and","Lianna"};
		
		//List<String> arrayToList = (List<String>) Arrays.;
		
		for(String z: arrayToList){
			System.out.print(" " +s);
		}
	}

}
