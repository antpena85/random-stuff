package stuff;
/* Simple demonstration of a If,else if, else using the fizzbuzz game.*/
public class FizzBuzz {

	public static void main(String[] args) {
		int n = 1;
		while (n<=20){
			System.out.print(fizzOrBuzz(n)+", ");
			n++;
		}

	}
	
	public static String fizzOrBuzz(int n){
		if(n%3==0)return "fizz";
		else if(n%5==0)return "buzz";
		else return ""+n;
	}

}
