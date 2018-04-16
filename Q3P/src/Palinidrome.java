
public class Palinidrome {
public static int isPali(String str){
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	String rev=sb.toString();
	if(str.equals(rev)){
		return 1;
	}else{
		return -1;
	}
}
public static void main(String args[]){
	System.out.println(Palinidrome.isPali("mom"));
	System.out.println(Palinidrome.isPali("madhan"));
}
}
