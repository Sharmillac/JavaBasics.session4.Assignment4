package assignment4;

public class cAssignment4 {

	public static void main(String[] args) 
	{
		mPrintReverseString();
		
	}

	private static void mPrintReverseString() {
		// TODO Auto-generated method stub
		  String lInput="AliveisAwesome";
		  StringBuilder lInput1 = new StringBuilder();
		  lInput1.append(lInput);
		  lInput1=lInput1.reverse(); 
		  for (int i=0;i<lInput1.length();i++)
		  {
			  System.out.print(lInput1.charAt(i));
		  }
		  System.out.println("");
		  System.out.println("============ALTERNATIVE WAY============== " );
		  // ALTERNATIVE
		  for (int i=lInput.length() - 1 ;i>= 0 ;i--)
		  {
			  System.out.print(lInput.charAt(i));
			  
		  }
	}

	

}
