package operatorsWithJava;

public class Message {
	
	String name, email, phone;

	public Message(String theName, String theEmail, String thePhone){

	name= theName;
	email=theEmail;
	phone=thePhone;
	}
	void displayEmail(){
	System.out.println("Email:"+ email);
	}

	void displayPhone(){

	System.out.println("Phone:" + phone);
	}



	public static void main(String[] args){

		Message JACK= new Message ("JACK", "JACK@xxx.xxx", "678-xxx-9999");

		System.out.println(JACK.name);
		JACK.displayEmail();

		Message ANDY=new Message("ANDY", "ANDY@xxx.xxx", "567-xxx-0000");

		System.out.println(ANDY.name);
		ANDY.displayPhone();



		}

}
