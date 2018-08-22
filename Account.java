public class Account 
{

  private String name; 
  private double balance; 
  private int pin; 
  boolean access; 
  
 	public Account(String n, double b, int p){

		name = n;
		balance = b;
		pin = p;
		access = false;
	}

	public String getName(){
		if(access){

			return name;
		}
		else {
			return null;
		}
	}

	public double getBalance(){

		if(access)
		{
			return balance;
		} 
		return 0;
	}

	public int getPin()
	{
		return pin;
	}

	public boolean getAccess(){
		 return access;
	}
	
	public void setAccess(int p)
	{
		if(p == pin)
		{
			access = true; 
		}
		access = false; 
	}
	
	public void setAccessTrue()
	{
		access = true; 
	}
	
	public void setBalance (double d){

		if(access){

			balance = d; 
		}
		else{
			System.out.println("no access"); 
		}
	}

	public void withdraw(double w)
	{
		if(access){
			balance -= w;
		}
	}
	public void deposit(double d)
	{
		if(access){
			balance+= d;
		}
	}


	
}
