
package package2;
import package1.*;

public class subfirst extends first{

	String defaultmessage="This is default message";
	public String publicmessage="This is public message";
	
	public static void main (String[] args)
	{
		third subf=new third();
	    System.out.println("now printing variable inside subfirst");
	    System.out.println(subf.protectedmessage);
	}

}
