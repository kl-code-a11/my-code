import java.util.Date;

public class Eval {
public static void main(String[] args) {
	Date date=new Date();
	String date1=String.format("%tc", date);
	String year=String.format("%tY",date);
	String month=String.format("%tm",date);
	String day=String.format("%td",date);
	System.out.println("今年是:"+year+"年");
	System.out.println("现在是:"+month+"月");
	System.out.println("今天是:"+day+"日");
	
	System.out.println(date1);
}
}
