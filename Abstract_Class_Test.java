
/*Create an abstract class as Bank with following abstract methods;
openAccount();
closeAccount();
Take one implementation class as SBI and implement Bank abstract class.
Take a Test class and test it.*/


abstract class Bank{
	abstract void openAccount();
	abstract void closeAccount();
}
class Sbi extends Bank{
	void  openAccount() {
		System.out.println("Account Opened Successfully...!"+"\n");
	}
	void closeAccount() {
		System.out.println("Account Closed ...!"+"\n");
	}
}
public class Abstract_Class_Test {

	public static void main(String[] args) {
		Bank bnk = new Sbi();
		bnk.openAccount();
		System.out.println("===================================="+"\n");
		bnk.closeAccount();

	}

}
