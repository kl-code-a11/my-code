
public class Division {
public static void main(String[] args) {
	String str="127.0.0.1";
	String[] firstArray=str.split("\\.");
	String[] secondArray=str.split("\\.",2);
	
	System.out.println("str��ԭֵ��:["+str+"]");
	System.out.println("ȫ���ָ�Ľ����:");
	for(String str1:firstArray) {
		System.out.print("["+str1+"]");
	}
	System.out.println();
	
	System.out.println("�ָ����εĽ����:");
	for(String str2:secondArray) {
		System.out.print("["+str2+"]");
	}
	System.out.println();
}
}
