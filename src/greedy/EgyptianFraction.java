package greedy;

public class EgyptianFraction {
	static void printEgyptian(int n, int d) {
		if(n == 0 || d == 0) {
			return;
		}
		
		if(d % n == 0) {
			System.out.println("1/" + d / n);
			return;
		}
		
		if (n % d == 0) {
			System.out.println(n / d );		
		}
		
		if (n > d) {
			System.out.println(n / d + " + ");
			printEgyptian(n % d, d);
			return;
		}
		
		int num = d/ n + 1;
		System.out.println("1/" + num + " + ");
		
		printEgyptian(n * num -d , d * num);		
		
	}
	
	public static void main(String[] args) {
		int nr = 6, dr =14;
        System.out.print("Egyptian Fraction Representation of "
                + nr + "/" + dr + " is "); 
        printEgyptian(nr, dr); 
	}
}
