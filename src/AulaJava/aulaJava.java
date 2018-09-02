package AulaJava;

public class aulaJava {
	
	public static int soma(int n1, int n2) { 
		int total = n1 + n2;
		return total;
	}
	
	public static double mult(int n1, int n2) { 
		double total = n1 * n2;
		return total;
	}
	
	public static int subs(int n1, int n2) { 
		int total = n1 - n2;
		return total;
	}
	
	public static double div(int n1, int n2) { 
		double total = n1 / n2;
		return total;
	}
	
	public static double exp(int n1, int n2) { 
		double total = 0;
		while(n2 > 0) {
			total += n1 * n1;
			n2 = n2 - 1;
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(soma(10,2));
		System.out.println(mult(10,2));
		System.out.println(subs(10,2));
		System.out.println(div(10,2));
		System.out.println(exp(10,2));
	}

}
