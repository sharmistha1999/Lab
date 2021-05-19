package Lab3;
import java.util.Scanner;

public class Lab3Exercise3 {
	public String replaceConsonants(String str)
    {
           StringBuffer sbr = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = sbr.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                  {
                        sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return sbr.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3Exercise3 p = new Lab3Exercise3();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.next();
        System.out.println(p.replaceConsonants(str));
	}

}
