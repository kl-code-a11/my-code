import java.util.Date;

public class getDate {
	public static void main(String[] args) {
			Date date=new Date();
			String hour=String.format("%tH", date);
			String minute=String.format("%tM", date);
			String second=String.format("%tS",date);
			
			System.out.println("������:"+hour+"ʱ"+minute+"��"+second+"��");
				
			}

		

	}

