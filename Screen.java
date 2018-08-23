import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Screen extends JPanel implements ActionListener
{
	ArrayList<Account> Accounts;

	private JTextField firstName; 
	private JTextField pinInput; 
	private JTextField withdrawInput;
	private JTextField depositInput; 

	private JButton mainButton; 
	private JButton withdraw; 
	private JButton deposit; 
	private JButton logout; 

	private boolean jennifer = false; 
	private boolean jose = false; 
	private boolean john = false; 
	private boolean jill = false;
	private boolean jacky = false;
	private boolean wrongInput = false; 

	public Screen()
	{
		this.setLayout(null);
			Accounts = new ArrayList<Account>(); 
			Accounts.add(new Account("Jennifer",999.99,1234));
			Accounts.add(new Account("Jose",500.01,4321));
			Accounts.add(new Account("John",550.01,4311));
			Accounts.add(new Account("Jill",600.01,4341));
			Accounts.add(new Account("Jacky",910.01,4391));

			pinInput = new JTextField(); 
			pinInput.setBounds(600,300,100,30); 
			this.add(pinInput); 
			
			firstName = new JTextField(); 
			firstName.setBounds(100,300,100,30); 
			this.add(firstName); 

			withdrawInput = new JTextField(); 
			withdrawInput.setBounds(650,500,100,30); 
			this.add(withdrawInput);
			withdrawInput.setVisible(false);	

			depositInput = new JTextField(); 
			depositInput.setBounds(650,425,100,30); 
			this.add(depositInput);
			depositInput.setVisible(false);

			mainButton =  new JButton("Enter");
			mainButton.setBounds(100,350,100,30); 
			mainButton.addActionListener(this);
			this.add(mainButton); 

			withdraw =  new JButton("Withdraw");
			withdraw.setBounds(650,535,100,30); 
			withdraw.addActionListener(this);
			this.add(withdraw); 
			withdraw.setVisible(false);

			deposit =  new JButton("Deposit");
			deposit.setBounds(650,465,100,30); 
			deposit.addActionListener(this);
			this.add(deposit); 
			deposit.setVisible(false);

			logout =  new JButton("Logout");
			logout.setBounds(10,10,100,30); 
			logout.addActionListener(this);
			this.add(logout); 
			logout.setVisible(false);


		this.setFocusable(true); 
	}

   public Dimension getPreferredSize() 
    {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
     
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
       	Font a = new Font("Helvetica", Font.BOLD, 50);
       	Color gunMetal = new Color(42, 45, 52);
       	Color livid = new Color(101, 126, 212);
       	g.setColor(gunMetal);
       	g.fillRect(0,0,800,600);
       	g.setFont(a);
       	g.setColor(livid); 
       	g.fillRect(100,100,600,150);
       	g.setColor(gunMetal);
       	g.drawString("Welcome to The Bank!",135,200);
		if(jennifer)
		{

			pinInput.setVisible(false);
			firstName.setVisible(false);	
			mainButton.setVisible(false);

			withdraw.setVisible(true);
			deposit.setVisible(true);
			withdrawInput.setVisible(true);
			depositInput.setVisible(true);
			logout.setVisible(true);

			g.setColor(livid);
			g.setFont(a); 
			double balance1 = Accounts.get(0).getBalance();
			String name = Accounts.get(0).getName(); 
			g.drawString("Welcome "+ name, 210,500);
			g.drawString("Balance: "+ balance1, 225,550);
		}

		else if(jose)
		{
			pinInput.setVisible(false);
			firstName.setVisible(false);	
			mainButton.setVisible(false);

			withdraw.setVisible(true);
			deposit.setVisible(true);
			withdrawInput.setVisible(true);
			depositInput.setVisible(true);
			logout.setVisible(true);

			g.setColor(livid);
			g.setFont(a); 
			double balance1 = Accounts.get(1).getBalance();
			String name = Accounts.get(1).getName(); 
			g.drawString("Welcome "+ name, 210,500);
			g.drawString("Balance: "+ balance1, 225,550);
		}
		else if(john)
		{
			pinInput.setVisible(false);
			firstName.setVisible(false);	
			mainButton.setVisible(false);

			withdraw.setVisible(true);
			deposit.setVisible(true);
			withdrawInput.setVisible(true);
			depositInput.setVisible(true);
			logout.setVisible(true);

			g.setColor(livid);
			g.setFont(a); 
			double balance1 = Accounts.get(2).getBalance();
			String name = Accounts.get(2).getName(); 
			g.drawString("Welcome "+ name, 210,500);
			g.drawString("Balance: "+ balance1, 225,550);
		}
		else if(jill)
		{
			pinInput.setVisible(false);
			firstName.setVisible(false);	
			mainButton.setVisible(false);

			withdraw.setVisible(true);
			deposit.setVisible(true);
			withdrawInput.setVisible(true);
			depositInput.setVisible(true);
			logout.setVisible(true);

			g.setColor(livid);
			g.setFont(a); 
			double balance1 = Accounts.get(3).getBalance();
			String name = Accounts.get(3).getName(); 
			g.drawString("Welcome "+ name, 210,500);
			g.drawString("Balance: "+ balance1, 225,550);
		}
		else if(jacky)
		{
			pinInput.setVisible(false);
			firstName.setVisible(false);	
			mainButton.setVisible(false);

			withdraw.setVisible(true);
			deposit.setVisible(true);
			withdrawInput.setVisible(true);
			depositInput.setVisible(true);
			logout.setVisible(true);

			g.setColor(livid);
			g.setFont(a); 
			double balance1 = Accounts.get(4).getBalance();
			String name = Accounts.get(4).getName(); 
			g.drawString("Welcome "+ name, 210,500);
			g.drawString("Balance: "+ balance1, 225,550);
		}
		else if (wrongInput)
		{
			g.setColor(livid);
			g.setFont(a); 
			g.drawString("Account does not exist!", 210,500);

		}

		repaint();

          
    }

    public void actionPerformed(ActionEvent e) 
    {


    	if(e.getSource() == deposit)
    	{
    		String depositAmount = depositInput.getText(); 
    		double result = Double.parseDouble(depositAmount);
    		System.out.println(result);
    		Accounts.get(0).deposit(result);

    	}

    	if(e.getSource() == withdraw)
    	{
    		String withdrawAmount = withdrawInput.getText(); 
    		double result = Double.parseDouble(withdrawAmount);
    		System.out.println(result);
    		if(Accounts.get(0).getBalance() >= result)
    		{
    			Accounts.get(0).withdraw(result);
    		}
    		
    	}

    	if(e.getSource() == logout)
    	{
			pinInput.setVisible(true);
			firstName.setVisible(true);	
			mainButton.setVisible(true);

			withdraw.setVisible(false);
			deposit.setVisible(false);
			withdrawInput.setVisible(false);
			depositInput.setVisible(false);
			logout.setVisible(false);
		    jennifer = false; 
			jose = false; 
			john = false; 
			jill = false;
			jacky = false;
			wrongInput = false; 
    	}

   		if(e.getSource() == mainButton)
		{

			
			String firstNameText = firstName.getText(); 
			String inputText = pinInput.getText();
			int result = Integer.parseInt(inputText);	
			

			if(firstNameText.equals("Jennifer") && result == 1234)
			{
				jennifer = true; 
				john = false; 
				jose = false; 
				jill = false; 
				jacky = false; 
		
				Accounts.get(0).setAccessTrue();
				System.out.println("Jennifer");

			}

			else if(firstNameText.equals("Jose") && result == 4321)
			{
				jose = true; 
				john = false;  
				jill = false; 
				jacky = false; 
				jennifer = false;
				Accounts.get(1).setAccessTrue(); 
				System.out.println("Jose"); 

			}

			else if(firstNameText.equals("John") && result == 4311)
			{
				john = true; 
				jose = false; 
				jill = false; 
				jacky = false; 
				jennifer = false;
				Accounts.get(2).setAccessTrue(); 
				System.out.println("John"); 
			}
			else if(firstNameText.equals("Jill") && result == 4341 )
			{
				jill = true;
				john = false; 
				jose = false; 
				jacky = false; 
				jennifer = false; 
				Accounts.get(3).setAccessTrue();
				System.out.println("Jill");
			}
			else if (firstNameText.equals("Jacky") && result == 4391)
			{
				jacky = true; 
				john = false; 
				jose = false; 
				jill = false; 
				jennifer = false;
				Accounts.get(4).setAccessTrue();
				System.out.println("Jacky");
			}

			else 
			{
				john = false; 
				jose = false; 
				jill = false; 
				jacky = false; 
				jennifer = false;
				wrongInput = true; 
			}
			
		}

    }
}
