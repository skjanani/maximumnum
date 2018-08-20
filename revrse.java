package janani;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
	  while(n>0){
			a=n%10;
			n=n/10;
			System.out.print(a);
		}

	}

}
