package dataStrutures_algorithms.algo.recursion;

public class Factorial {
	
	public int factor(int n) {
		if (n == 1)
			return 1;
		return n*factor(n-1);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factor(4));
	}

}
