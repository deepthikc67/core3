import java.sql.Date;
import java.text.SimpleDateFormat;


public class Checkday {
public static String getday(Date d1){
	String s1;
	SimpleDateFormat sdf=new SimpleDateFormat ("EEEEE");
	s1=sdf.format(d1);
	return s1;
}
public static void main(String args[]){
	Date d1=new Date(2018/16/4);
	System.out.println("day is :" + getday(d1));
}
}
