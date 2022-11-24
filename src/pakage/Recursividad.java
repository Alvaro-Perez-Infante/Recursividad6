package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n = 9;

		System.out.println("El doble factorial de: " + n + " es: " + doblefactorial(n));

	}

	public static int doblefactorial(int n) {
		
		int r;
		
		if (n == 1) {
			r = 1;
		} else {
			r = n * doblefactorial (n-2);
		}
		return r;
	}

}