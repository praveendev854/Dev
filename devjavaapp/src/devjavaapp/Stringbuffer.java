package devjavaapp;

public class Stringbuffer {
	public static void togglechars(char str[]) {
		for (int i=0;i<str.length;i++)
		{
			if(str[i]>='A' && str[i]<='Z')
				str[i]=(char)(str[i]+'a' -'A');
			else if (str[i]>='a' && str[i]<='Z')
				 str[i] = (char) (str[i] +'A' -'a');
		}
	}
 
public static void main(string[] args)
{
	 char str[]="I am sample".toCharArray();
	 togglechars(str);
	 System.out.println("string after toggle ");
	 System.out.println(string.valueof(str));
	 
	 
}

}
