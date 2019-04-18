package operatorsWithJava;

public class classPractices_eb_2632019 {

	public static void main(String[] args) {
		
		/*این کال کلاس در بخش کلاس دیگر تعریف شده است و اینجا کال شده و از ان یک ابجگیت بنام دومتس ساخته شده و بعدش ادد کال شده که یک فانکشن است.*/
		callClass doMaths = new callClass();
		System.out.println("12+22="+doMaths.add(12, 22));
		System.out.println("12-22="+doMaths.minus(12, 22));
		System.out.println("12*22="+doMaths.multiply(12, 22));
		System.out.println("45/22="+doMaths.divid(45, 22));		
	}

}
