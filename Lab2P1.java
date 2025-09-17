import java.util.Scanner;
class Lab2P1{
		public static void main(String...args){
					Scanner s=new Scanner(System.in);
					int x = s.nextline();
					int y=x;
					System.out.println("output is:"+ x++ + ++x);
					x=y;
					System.out.println("output is:"+(x++ + ++x));
					x=y;
					System.out.println(+ x++ + ++x"output is:");
		}
}
