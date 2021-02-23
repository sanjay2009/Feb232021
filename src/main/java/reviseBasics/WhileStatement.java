package reviseBasics;

public class WhileStatement {

	public static void main(String[] args) {
		
//		int x = 1;
//		
//		while(x <= 10)
//		{
//			
//			System.out.println(x);
//			x++;
//			
//		}
		
		int x = 1;
		int sum = 0;
		while(x <= 10)
		{
			sum = sum + x;
			x++;
		}
		
		System.out.println(sum);

	}

}
