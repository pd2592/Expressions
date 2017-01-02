package assignment.acadgild;

public class Expressions {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		
		b= a-- - --a;
		int c=a--;
		int d=a>>2;
		int e=a&b;
		
		System.out.println(b+"\n"+c+"\n"+d+"\n"+e);
	}
}
