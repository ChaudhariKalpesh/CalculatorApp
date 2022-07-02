public class DoWhileSwitch {
	public static void main(String args[])
	{
		int n1,n2;
		int c=0;
			System.out.println( "Enter any two numbers:");
			n1=10;
			n2=15;
			System.out.println("a. Addition\nb. Subtraction\nc. Multiplication\nd. Division\ne. Exit");
			System.out.println("Enter Your Choice: ");
				c=n1+n2;
				System.out.println("Addition of two numbers is: "+c);
				if(n1>n2)
					c=n1+n2;
				else
					c=n2-n1;
				System.out.println("Subtraction of two numbers is: "+c);


				c=n1*n2;
				System.out.println("Multiplication of two numbers is: "+c);


				if(n2==0)
					System.out.println("Denominator should not be zero");
				else
				{
					c=n1/n2;
					System.out.println("Division of two numbers is: "+c);
				}

	}
	
}
