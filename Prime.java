package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, i;
		for (i = 1; i <=10; i++) {
			if(n%i==0)
			{
				System.out.println("the num is not prime");
			}
			else {
				System.out.println("the num is prime");
			}
		}

	}

}
