import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menupage extends JFrame{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 350;
	
	private class CheckExit implements WindowListener{
		public void windowOpened(WindowEvent e){
		}
		public void windowClosing(WindowEvent e){
			dispose();
		}
		public void windowClosed(WindowEvent e){
		}
		public void windowIconified(WindowEvent e){
		}
		public void windowDeiconified(WindowEvent e){
		}
		public void windowActivated(WindowEvent e){
		}
		public void windowDeactivated(WindowEvent e){
		}
	}
	
	public menupage() {
		setSize(WIDTH, HEIGHT);
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new CheckExit());
		setLayout(new BorderLayout());
		
		
		JPanel buttonPanel=new JPanel();
        BoxLayout box=new BoxLayout(buttonPanel,BoxLayout.Y_AXIS);
        buttonPanel.setLayout(box);
        setLocationRelativeTo(null);
        buttonPanel.add(Box.createVerticalStrut(50));
        JButton HELP =new JButton();
        HELP.setAlignmentX(Component.CENTER_ALIGNMENT);
		HELP.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) {    
            	Rulepage rule=new Rulepage();
    			rule.setVisible(true);
    			dispose(); 
            }
        } );
		ImageIcon helpicon = new ImageIcon("Resource/HELP2.png");
		HELP.setIcon(helpicon);
		HELP.setBorderPainted(false);
		buttonPanel.add(HELP);
		buttonPanel.add(Box.createVerticalStrut(10));
		JButton Restart=new JButton();
		Restart.setAlignmentX(Component.CENTER_ALIGNMENT);
		Restart.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                mainpage.game.dispose();
                mainpage.game=new GamePage();
                mainpage.game.setVisible(true);
            	dispose();
            }
		} );
		ImageIcon restarticon = new ImageIcon("Resource/RESTART.png");
		Restart.setIcon(restarticon);
		Restart.setBorderPainted(false);
		buttonPanel.add(Restart);
		buttonPanel.add(Box.createVerticalStrut(10));
		JButton Quit=new JButton();
		Quit.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
            	mainpage.game.dispose();
            	mainpage gui =new mainpage();
            	gui.setVisible(true);
            	dispose();
            }
		} );
		ImageIcon quiticon = new ImageIcon("Resource/QUIT.png");
		Quit.setIcon(quiticon);
		Quit.setBorderPainted(false);
		Quit.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonPanel.add(Quit);
	
        add(buttonPanel,BorderLayout.CENTER);
	}

}


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class menupage extends JFrame {
// 	public static final int WIDTH = 450;
// 	public static final int HEIGHT = 250;
	
// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub
// 		menupage gui=new menupage();
// 		gui.setVisible(true);
// 	}
// 	private class CheckExit implements WindowListener{
// 		public void windowOpened(WindowEvent e){
// 		}
// 		public void windowClosing(WindowEvent e){
// 			dispose();
// 		}
// 		public void windowClosed(WindowEvent e){
// 		}
// 		public void windowIconified(WindowEvent e){
// 		}
// 		public void windowDeiconified(WindowEvent e){
// 		}
// 		public void windowActivated(WindowEvent e){
// 		}
// 		public void windowDeactivated(WindowEvent e){
// 		}
// 	}
	
// 	public menupage() {
// 		setSize(WIDTH, HEIGHT);
// 		setTitle("MENU");
// 		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
// 		addWindowListener(new CheckExit());
// 		setLayout(new BorderLayout());
		
		
// 		JPanel buttonPanel=new JPanel();
//         BoxLayout box = new BoxLayout(buttonPanel,BoxLayout.Y_AXIS);
//         buttonPanel.setLayout(box);
//         setLocationRelativeTo(null);
//         buttonPanel.add(Box.createVerticalStrut(50));
//         JButton helpButton = new JButton("HELP");
//         helpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
// 		helpButton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) {    
//             	rulepage rule=new rulepage();
//     			rule.setVisible(true);
//     			dispose(); 
//             }
//         } );
// 		buttonPanel.add(helpButton);
// 		buttonPanel.add(Box.createVerticalStrut(10));
// 		JButton restartButton = new JButton("RESTART");
// 		restartButton.setAlignmentX(Component.CENTER_ALIGNMENT);
// 		restartButton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) { 
// 				//gamepage game=new gamepage();
// 				//game.setVisible(true);
//             	mainpage.game.dispose();
//                 mainpage.game=new GamePage();
//                 mainpage.game.setVisible(true);
//             	dispose();
//             }
// 		} );
// 		buttonPanel.add(restartButton);
// 		buttonPanel.add(Box.createVerticalStrut(10));
// 		JButton quitButton = new JButton("QUIT");
// 		quitButton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) { 
// 				//mainpage gui=mainpage();
// 				//gui.setVisible(true);
//             	mainpage.game.dispose();
//             	mainpage gui =new mainpage();
//             	gui.setVisible(true);
//             	dispose();
//             }
// 		} );
// 		quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
// 		buttonPanel.add(quitButton);
	
//         add(buttonPanel,BorderLayout.CENTER);
// 	}

// }
