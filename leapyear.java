import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="leapyear" width=500 height=500> </applet> */	
	
public class leapyear extends Applet implements ActionListener{

	
	  Label l1,l2;
	  TextField t1,t2;
	  Button b1;
	  public void init()
	  {
	      l1=new Label("Enter a year: ");
	      

	      l2=new Label("Result");
	      l2.setBounds(10,130,100,20);

	      t1=new TextField(10);
	      t1.setBounds(10,100,100,20);
	      t2=new TextField(20);
	    
	      b1=new Button("Check leap year");
	     
	      add(l1);
	      add(t1);
	      add(b1);
	      
	      add(l2);
	      add(t2);
	      

	      b1.addActionListener(this);
	     
	  }
	  public void actionPerformed(ActionEvent ae)
	{
		int year = Integer.parseInt(t1.getText());
		boolean leap = false;

		if (ae.getSource() == b1) {
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					// year is divisible by 400, hence the year is a leap year
					if (year % 400 == 0)
						leap = true;
					else
						leap = false;
				} else
					leap = true;
			} else
				leap = false;
			if (leap)
				t2.setText(String.valueOf(year)  +   "is a leap year");
			else
				t2.setText(String.valueOf(year)  +   "is not a leap year");

		}

	}
	
}
