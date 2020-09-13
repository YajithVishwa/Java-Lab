import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class listener1 extends JFrame implements WindowStateListener { 
    listener1() 
    { 
        super("main frame"); 
        setSize(500, 500); 
  
        // create a sub frame 
        JFrame f = new JFrame("sub"); 
  
        // add window state listener 
        f.addWindowStateListener(this); 
  
        // set size of window 
        f.setSize(200, 200); 
  
        show(); 
        f.show(); 
    } 
  
    // if state of window is changed 
    public void windowStateChanged(WindowEvent e) 
    { 
        JOptionPane.showMessageDialog(this, "window state changed"); 
    } 
    // main class 
    public static void main(String args[]) 
    { 
        listener1 l = new listener1(); 
    } 
} 