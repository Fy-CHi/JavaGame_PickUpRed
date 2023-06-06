import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Rulepage extends JFrame implements WindowListener{
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		dispose();
	}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	
	public static final int WIDTH = 1300;
	public static final int HEIGHT = 540;
	public Rulepage() {
		setSize(WIDTH, HEIGHT);
		setTitle("Rule");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(this);
		setLayout(new BorderLayout());
    	setResizable(false);
		JScrollPane js = new JScrollPane();
		getContentPane().add(js);
		
		JPanel rulepanel= new JPanel();
		BoxLayout box=new BoxLayout(rulepanel,BoxLayout.Y_AXIS);
		rulepanel.setLayout(box);
		rulepanel.setOpaque(false);
		Container cp=getContentPane();
		cp.setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		
		JLabel picture=new JLabel(new ImageIcon("rule_1.png"));
		picture.setHorizontalAlignment(JLabel.CENTER);
		rulepanel.add(picture);
		JLabel picture2=new JLabel(new ImageIcon("rule_2.png"));
		picture2.setHorizontalAlignment(JLabel.CENTER);
		rulepanel.add(picture2);
		JLabel picture3=new JLabel(new ImageIcon("rule_3.png"));
		picture3.setHorizontalAlignment(JLabel.CENTER);
		rulepanel.add(picture3);
		JLabel picture4=new JLabel(new ImageIcon("rule_4.png"));
		picture4.setHorizontalAlignment(JLabel.CENTER);
		rulepanel.add(picture4);
		
		
	    JScrollPane scrollpane =new JScrollPane(rulepanel);
	    scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		cp.add(scrollpane,BorderLayout.CENTER);
		
	}	
	// public static void main(String[] args){
	// 	rulepage rule=new rulepage();
	// 	rule.setVisible(true);
	// }

}