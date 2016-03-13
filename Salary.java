import javax.swing.JOptionPane;
public class Salary
{
	final static int basesalarylevel1 = 20000;
	final static int basesalarylevel2 = 25000;
	final static int basesalaryboss = 30000;
	static int hour1;
	static int hour2;
	static int level;
	static String firstname;
	static String lastname;
	static float salary;
	static float salary1;
	static float salary2;
	final static float additionalwork = 1.5f;
	final static int highworklimit = 60;
	final static int lowsalarylimit = 600000;
	final static int normalsalaryhourlimit = 40;
	
	public static float normalsalary (int x , int hour1)
	{
		if (x == 1)
		salary1 = hour1 * basesalarylevel1;
		if (x == 2)
		salary1 = hour1 * basesalarylevel2;
		if (x == 3)
		salary1 = hour1 * basesalaryboss;
		return salary1;
	}
	public static float additionalsalary (int x , int hour2)
	{
		if (x == 1)
		salary2 = normalsalary (1 , hour2 ) * additionalwork;
		if (x == 2)
		salary2 = normalsalary (2 , hour2 ) * additionalwork;
		if (x == 3)
		salary2 = normalsalary (3 , hour2 ) * additionalwork;
		return salary2;
	}
	public static void message (int x)
	{
		if (x == 1)
		JOptionPane.showMessageDialog(null, "your hours of work is more than 60 h , This is wrong and I gonna ending this program, you can try again", "your limits", JOptionPane.ERROR_MESSAGE);
		if (x == 2)
		JOptionPane.showMessageDialog(null, "Your salary is less than 600 thousand tomans , this is wrong , you had a mistake", "Your limits", JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Hello , my name is salary counter , at your service !", "Greeting", JOptionPane.INFORMATION_MESSAGE);
		firstname = JOptionPane.showInputDialog("In first step , I need your first name", "please enter your first name here :");
		lastname = JOptionPane.showInputDialog(" In second step , I need to know your last name ", "please enter your last name here :");
		String url1 = JOptionPane.showInputDialog("Ok now, I need to know that how many hours you working in your normal working in office", "this is equal or less than 40 h :");
		String url2 = JOptionPane.showInputDialog(" So , for now, I need to know that Do you have any additional working hours ?how many?", "if you have not enter 0 ");
		hour1 = Integer.parseInt( url1 );
		hour2 = Integer.parseInt( url2 );
		int hour = hour1 + hour2;
		if ( hour > 60)
		message(2);
		String url3 = JOptionPane.showInputDialog("Enter your level\n if you are officer level 1 , enter number 1 , if you are officer level 2 , enter number 2 , if you are a boss , enter number 3 ");
		level = Integer.parseInt( url3 );
		JOptionPane.showMessageDialog(null, "Thank you for your cooperation", "Thanks",JOptionPane.INFORMATION_MESSAGE);
		salary = normalsalary (level, hour1) + additionalsalary (level, hour2);
		if (salary < 600000)
		message(1);
		JOptionPane.showMessageDialog(null, "your first name : " + firstname + "\nyour last name : " + lastname +"\nyour salary in this month is :" + salary + " Tomans");  
	}
}
