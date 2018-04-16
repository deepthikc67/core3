import java.util.Scanner;


public class Evenodd {
public static int Even (int n){
	int n1,n2=0,n3 = 0;
	while(n!=0){
		n1=n%10;
		if((n1/2)!=0){
			n2+=n1;
			n1=10;
		}
		if(n2%2==0){
			return -1;
		}
		else{
			n3=1;
		return 1;
		}
	
}
	return n3;
	}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(Evenodd.Even(n));
}
}
