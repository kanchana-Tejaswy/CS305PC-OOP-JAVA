// method over loading
class Lab3P3{
			public static void main(String[] args){
			Lab3P3 
			l.display(); l.display(10);l.display("String");l.display(10, "String");
			}
			
			public void show(){
						System.out.println("Method without params");
						
			}
			public void show(int x){
						System.out.println("Method with int params: " +x);
			}
			public void show(String s){
							System.out.println("Method with String parans: " +s);
							
			}
			public void show(int x, String s){
						System.out.println("Method with two params int and String: "+ x + " "+ s);
			}
			
			
}
