package janani;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,fact=1;
		System.out.println("enter the number");
		Scanner ja=new Scanner(System.in);
		n=ja.nextInt();
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
