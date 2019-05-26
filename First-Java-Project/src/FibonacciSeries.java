
public class FibonacciSeries {

	int a = 0;
	int b = 1;
	int length = 20;

	public void fibonacciSeries() {
		for (int i = 0; i < length; i++) {
			System.out.print(a + " ");
			a = b - a;
			b = a + b;
		}
	}
}
//Output is 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 