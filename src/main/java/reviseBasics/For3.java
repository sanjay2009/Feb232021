package reviseBasics;

public class For3 {
	//Display Sum of n Natural Numbers
	public static void main(String[] args) {
		
		int sum = 0;
		int n = 100;
		
		for (int i =1; i < n; i++)
		{
			sum = sum + n;
			i++;
		}
		System.out.println(sum);

	}

}
