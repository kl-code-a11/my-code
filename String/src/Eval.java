import java.util.Date;

public class Eval {
public static void main(String[] args) {
	Date date=new Date();
	String date1=String.format("%tc", date);
	String year=String.format("%tY",date);
	String month=String.format("%tm",date);
	String day=String.format("%td",date);
	System.out.println("������:"+year+"��");
	System.out.println("������:"+month+"��");
	System.out.println("������:"+day+"��");
	
	System.out.println(date1);
}
}
