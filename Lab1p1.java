class Lab1p1{
	public static void main(String...args){
		byte b = 126;
		Byte bb = b; //AutoBoxing
		
		//int x =20;
		//byte b =(byte)x;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(bb.MIN_VALUE);
		System.out.println(bb.TYPE);
		System.out.println(bb.SIZE);
		System.out.println(bb.BYTES);
		System.out.println("-----Integer----");
		
		short s = 15;
		Short ss = s; //AutoBoxing
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(ss.MIN_VALUE);
		System.out.println(ss.TYPE);
		System.out.println(ss.SIZE);
		System.out.println(ss.BYTES);
		System.out.println("-----Integer----");
		
		int i = 15;
		Integer ii = i; //AutoBoxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(ii.MIN_VALUE);
		System.out.println(ii.TYPE);
		System.out.println(ii.SIZE);
		System.out.println(ii.BYTES);
		System.out.println("-----Integer----");
		
		
		}
}
