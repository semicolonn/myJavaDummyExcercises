package operatorsWithJava;

	//Inheritance in Java;

class superClass{
	int test(int num){
		num= 700;
	return num;
	
	}
	//overriding
	}

	class subClass extends superClass{
	int test(int num){
	return 100+num;
	}
	//overriding
	/*
	 * what is defined in SuperClass **override** by sub Class.
	 * if methods or variables to be with same Name in example.
	 */
	}
	
	
	class MyClass{
		static int count= 100;
		static int count() {
			return 100;
		}
				
	}
	
	class animal{
		final void test() {
			System.out.println("Animal");
		}
	}
	class dog extends animal{
		//error in below but can run************
		void test() {
			System.out.println("dog");
		}
	}

	

	public class inheritanceInJava{
	
	public static void main(String args[]){
	
	subClass obj= new subClass();
	
	System.out.println("This is the output of Overriding:" +obj.test(200));
	
	//class the static Variable of MyClass here"count";
	
	System.out.println("This output from a static defined variable (MyClass.count):" +MyClass.count);
	//calling static method here;
	System.out.println("This is static method count():"+ MyClass.count());
	//calling final variable;
	
	
	}
	
	}
	
	

