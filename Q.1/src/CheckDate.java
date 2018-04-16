/*import java.util.Scanner;


public class CheckDate {

public static void  main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println(" enter the format in dd/mm/yyyy");
	int d=s.nextInt();
	System.out.println("enter the date in format dd/mm/yyyy");
	int dd=s.nextInt();
}
}
*/import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class CheckDate{
   public static boolean validateJavaDate(String strDate)
   {
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}
   }
   public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the format");
	int javaDate=s.nextInt();
	/*String date=s.format(date);*/
   }
}