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
	private JButton firstNameButton; 
	private JButton pinButton; 

	public Screen()
	{
		this.setLayout(null);
			Accounts = new ArrayList<Account>(); 
			Accounts.add(new Account("Jennifer",999.99,1234));
			Accounts.add(new Account("Jose",500.01,4321));
			Accounts.add(new Account("John",550.01,4311));
			Accounts.add(new Account("Jill",600.01,4341));
			Accounts.add(new Account("Jacky",910.01,4391));

			firstName = new JTextField(); 
			firstName.setBounds(100,300,100,30); 
			this.add(firstName); 
			pinInput = new JTextField(); 
			pinInput.setBounds(600,300,100,30); 
			this.add(pinInput); 

			firstNameButton =  new JButton("First Name");
			firstNameButton.setBounds(100,350,100,30); 
			firstNameButton.addActionListener(this);
			this.add(firstNameButton); 

			pinButton =  new JButton("Pin");
			pinButton.setBounds(600,350,100,30); 
			pinButton.addActionListener(this);
			this.add(pinButton); 

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

          
    }

    public void actionPerformed(ActionEvent e) 
    {

   		if(e.getSource() == pinButton)
		{
			String inputText = pinInput.getText();
			int result = Integer.parseInt(inputText);	
		

			if(Accounts.get(0).getPin() == result)
			{
				System.out.println("You're in"); 
			}
			else 
			{
				System.out.println("You are out");
			}
		}

    }
	public void animate()
    {

    }	


}