

import java.util.Scanner;

public class vowels
{
public static void main(String args[])
{
	Scanner sb=new Scanner(System.in);
	String s=new String();
	s=sb.next();
	int i;
	char b[]=new char[100];
	b=s.toCharArray();
	/*for(int i=0;i<s.length();i++)
	{	
		System.out.println(b[i]);
	}*/
	for(i=b.length-1;i>=0;i--)
	{
		if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]== 'u' || b[i]=='A' || b[i]=='E' || b[i]=='I' || b[i]=='O' || b[i]=='U')
		{
			
		}
		else
		{
			
			
			System.out.print(b[i]);
		}
	}
	
	}


}
