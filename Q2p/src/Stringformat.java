
public class Stringformat {
public static String reverseString(String str){
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	return sb.toString();
	
}
public static void main(String args[]){
	System.out.println( Stringformat.reverseString("my name is deepu"));
}
}
