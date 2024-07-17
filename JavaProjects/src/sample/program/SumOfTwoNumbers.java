package sample.program;

public class SumOfTwoNumbers {
	
	public void sum(int n1,int n2) {
		
		int sum = n1+n2;
		System.out.println("Sum is :"+sum);
	}

	public static void main(String[] args) {
		
		SumOfTwoNumbers obj=new SumOfTwoNumbers();
		obj.sum(10,20);
	}

	

}
