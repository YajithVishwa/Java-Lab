import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class listener extends JFrame implements WindowStateListener { 
    // label 
    JLabel l; 
    JLabel l1; 
  
    listener() 
    { 
        super("main frame"); 
        setSize(500, 500); 
  
        // create a sub frame 
        JFrame f = new JFrame("sub"); 
  
        // add window state listener 
        f.addWindowStateListener(this); 
  
        // set size of window 
        f.setSize(200, 200); 
  
        // create a label 
        JLabel lo = new JLabel("old state : "); 
        JLabel lo1 = new JLabel("new state : "); 
  
        l = new JLabel(""); 
        l1 = new JLabel(""); 
  
        // create a panel 
        JPanel p = new JPanel(); 
  
        p.add(lo); 
        p.add(l); 
        p.add(lo1); 
        p.add(l1); 
        add(p); 
  
        show(); 
        f.show(); 
    } 
  
    // if state of window is changed 
    public void windowStateChanged(WindowEvent e) 
    { 
        int s = e.getOldState(), s1 = e.getNewState(); 
  
        // for old state 
        if (s == Frame.ICONIFIED) 
            l.setText("window iconified"); 
  
        if (s == Frame.MAXIMIZED_BOTH) 
            l.setText("window maximized horizontally and vertically"); 
  
        if (s == Frame.MAXIMIZED_HORIZ) 
            l.setText("window maximized horizontally"); 
  
        if (s == Frame.MAXIMIZED_VERT) 
            l.setText("window maximized verically"); 
  
        if (s == Frame.NORMAL) 
            l.setText("window normal"); 
  
        // for new state 
  
        if (s1 == Frame.ICONIFIED) 
            l1.setText("window iconified"); 
  
        if (s1 == Frame.MAXIMIZED_BOTH) 
            l1.setText("window maximized horizontally and vertically"); 
  
        if (s1 == Frame.MAXIMIZED_HORIZ) 
            l1.setText("window maximized horizontally"); 
  
        if (s1 == Frame.MAXIMIZED_VERT) 
            l1.setText("window maximized verically"); 
  
        if (s1 == Frame.NORMAL) 
            l1.setText("window normal"); 
    } 
  
    // main class 
    public static void main(String args[]) 
    { 
        listener l = new listener(); 
    } 
}