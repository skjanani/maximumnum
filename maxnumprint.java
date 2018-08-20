import java.util.Scanner;
public class secondsmallest {
public static void main(String[] args) {
  int i,j,n,n1,temp=0,count=0;
  System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	n1=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	count++;
	if(count==n1){
		System.out.println(a[i]);
	}
	}
	
}
}
