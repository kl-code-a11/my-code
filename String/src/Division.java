
public class Division {
public static void main(String[] args) {
	String str="127.0.0.1";
	String[] firstArray=str.split("\\.");
	String[] secondArray=str.split("\\.",2);
	
	System.out.println("str的原值是:["+str+"]");
	System.out.println("全部分割的结果是:");
	for(String str1:firstArray) {
		System.out.print("["+str1+"]");
	}
	System.out.println();
	
	System.out.println("分割两次的结果是:");
	for(String str2:secondArray) {
		System.out.print("["+str2+"]");
	}
	System.out.println();
}
}
