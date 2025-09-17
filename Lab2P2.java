import java.util.Scanner;
class Lab2P1{
		public static void main(String...args){
					Scanner s=new Scanner(System.in);
					int a = s.nextInt();
					int b = s.nextInt();
					String op = s.next();
					String str = switch(op){
					case "==" -> "hello";
					case"--","=","-"->"not good";
					};
					System.out.println("result is:"+ str);
			}					
}
