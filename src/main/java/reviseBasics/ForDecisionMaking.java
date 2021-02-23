package reviseBasics;

public class ForDecisionMaking {

	public static void main(String[] args) {
		
		int[] marks = {125, 127, 100,121, 205, 200};
		int highest_marks = maximum(marks);	
		System.out.println(highest_marks);
	}
	
		public static int maximum(int[] numbers)
		{
			int max_marks = numbers[0];
			for(int num : numbers)
			{
				if(num > max_marks)
				{
					max_marks = num;
				}
			}
			
			return max_marks;
		}

}
