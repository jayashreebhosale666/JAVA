import java.util.Scanner;

class Account {
int ac_id,t_bal;
String a_name,branch,B_addr;
private Scanner sc;
void acceptbankDetail()
{
	sc = new Scanner(System.in);
	System.out.println("Enter Account ID: ");
	ac_id=sc.nextInt();
	System.out.println("Enter Account Holder name: ");
	a_name=sc.next();
	System.out.println("Enter Account Balance: ");
	t_bal=sc.nextInt();
	System.out.println("Enter Branch Name: ");
	branch=sc.next();
	System.out.println("Enter branch Address: ");
	B_addr=sc.next();
}
void displayDetail()
{
	System.out.println("Account Id: "+ac_id);
	System.out.println("Account Holder Name: "+a_name);
	System.out.println("Account Total Balance: "+t_bal);
	System.out.println("Branch Name: "+branch);
	System.out.println("Branch Address: "+B_addr);
}
}
public class BankAccount
{
	public static void main(String args[])
	{
		Account a=new Account();
		a.acceptbankDetail();
		a.displayDetail();
		
	}
}
