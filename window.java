import java.awt.*;
import java.awt.event.*;
public class window extends JFrame implements WindowStateListener
{
	window()
	{
		super("Yajith window");
		setSize(500,500);
		JFrame j=new JFrame("vishwa");
		j.addWindowStateListener(this);
		f.setSize(150,150);
		show();
		f.show();
	}
	public void windowStateChanged(WindowEvent e)
	{
		JOptionPane.showMessageDialog(this, "This is dialog box");
	}
	public static void main(String arg[])
	{
		new window();
	}
}