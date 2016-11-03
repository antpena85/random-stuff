package stuff;

public class JustAMain {

	public static void main(String[] args) {
		System.err.println("This is just a main and location where I will initialize other classes");
		
		String x = "Hi";
		
		String s = new String(x);
		
		System.out.println(x==s); //should return false
		System.out.println(x.equals(s));//should return true
	}

}
