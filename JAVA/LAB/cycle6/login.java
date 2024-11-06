import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test implements ActionListener
{
	JLabel u,pw,l3;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	test()
	{
	        JFrame f=new JFrame("Login page");
	        u=new JLabel("enter name");
	        t1=new JTextField(20);
	        pw=new JLabel("password");
	        t2=new JPasswordField(3);
	        b1=new JButton("submit");
	        b2=new JButton("cancel");
	        l3=new JLabel("");
	        JPanel p=new JPanel(new GridLayout(4,2));
	        p.add(u);
	        p.add(t1);
	        p.add(pw);
	        p.add(t2);
	        p.add(b1);
	        p.add(b2);
	        p.add(l3);
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        f.add(p);
	        f.setSize(400,200);
	        f.show();
	}
	
	public void actionPerformed(ActionEvent e)
	{
	        String s=e.getActionCommand();
	        if(s.equals("submit"))
	        {
	          
	                String s1=t1.getText();
	                String s2=t2.getText();
	                if(s1==null || s2==null)
	                {
	                	l3.setText("username or password required");
	                }
	                else
	                {
	                	String s3=s1+" "+s2;
	                	l3.setText(s3);
	                }
	                //set the text of field to blank
	                t1.setText(" ");
	                t2.setText(" ");
	        }
	        if(s.equals("cancel"))
	        {
	        	t1.setText(" ");
	        	t2.setText("");
	        }
	}
	public static void main(String args[])
	{
	        test t=new test();
	}
}
