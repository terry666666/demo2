import java.util.Date;


public class Test {
	public static void main(String[] args) {
		//Date类的核心：毫秒数
		Date d=new Date();//当前时刻的毫秒数
		
		System.out.println(d.getTime());
		System.out.println(d);
		System.out.println(System.currentTimeMillis());
		Date d1 =new Date(1999351753);
		System.out.println(d1.toGMTString());
		System.out.println(d1.before(d));
		System.out.println(d1.equals(d));
		
		
	}
}
