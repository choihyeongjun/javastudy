public class VariableExample3{
	public static void main(String arg[])
	{
		byte b1=-128;
		byte b2= 125;
		System.out.println(b1++);
		System.out.println(++b1);
		System.out.println(b2++);
		System.out.println(++b2);          
		
		for(int i=0;i<3;i++)
		{
			System.out.println(b1++);
		}
	}
}