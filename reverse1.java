package janani;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		System.out.println("enter the String");
		Scanner ja=new Scanner(System.in);
		str=ja.next();
        int l=str.length();
        String str1=" ";
        for(i=l-1;i>=0;i--){
        	str1=str1+str.charAt(i);
        }
        System.out.println(str1);
		}

	}


