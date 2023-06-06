import java.awt.*;
import java.lang.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class mainpage extends JFrame {
    public static final int WIDTH=1280;
    public static final int HEIGHT=720;
    public static GamePage game;

    public mainpage(){
        setSize(WIDTH,HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon background=new ImageIcon("Resource/ENTRY.png");
        JLabel label = new JLabel(background);
        label.setBounds(0,0,WIDTH,HEIGHT);
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
//        JFrame frame = new JFrame();
//        frame.getLayeredPane().add(label,10);
//        JPanel jp=(JPanel)frame.getContentPane();
//        jp.setOpaque(false);
        
        JPanel wt=new JPanel();
        wt.setOpaque(false);
        BoxLayout box=new BoxLayout(wt,BoxLayout.Y_AXIS);
        wt.setLayout(box);
        setTitle("SDGSGOALMATCH");
        setLayout(new BorderLayout());
        wt.add(Box.createVerticalStrut(300));

        JButton startbutton=new JButton();
        startbutton.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                new start();
                dispose();
            }
        } );
        ImageIcon starticon = new ImageIcon("Resource/START.png");
        startbutton.setIcon(starticon);
        startbutton.setBorderPainted(false);
        startbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
        wt.add(startbutton);
        wt.add(Box.createVerticalStrut(5));
        
        JButton helpbutton=new JButton();
        helpbutton.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                new help();
            }
        } );
        
        ImageIcon helpicon = new ImageIcon("Resource/HELP.png");
        helpbutton.setIcon(helpicon);
        helpbutton.setBorderPainted(false);
        helpbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
        wt.add(helpbutton);
        wt.add(Box.createVerticalStrut(5)); 
        
        JButton endbutton=new JButton();
        endbutton.addActionListener( new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                System.exit(0);
            }
        } );
        
        ImageIcon exiticon = new ImageIcon("Resource/EXIT.png");
        endbutton.setIcon(exiticon);
        endbutton.setBorderPainted(false);
        endbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
        wt.add(endbutton);

        add(wt);
    }


     class start extends JFrame{
         public start(){
            game=new GamePage();
            game.setVisible(true);
         }
     }
     class help extends JFrame{
         public help(){
            Rulepage rule=new Rulepage();
            rule.setVisible(true);
         }
     }

  }


// import java.awt.*;
// import java.lang.*;
// import java.io.*;
// import javax.imageio.ImageIO;
// import java.awt.Color;
// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class mainpage extends JFrame {
//     public static final int WIDTH=1280;
//     public static final int HEIGHT=720;
//     public static GamePage game;

//     public mainpage(){
//         setSize(WIDTH,HEIGHT);
//         setResizable(false);
//         setLocationRelativeTo(null);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
        
//         ImageIcon background=new ImageIcon("Resource/ENTRY.png");
//         JLabel label = new JLabel(background);
//         label.setBounds(0,0,WIDTH,HEIGHT);
//         JPanel imagePanel = (JPanel) this.getContentPane();
//         imagePanel.setOpaque(false);
//         this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
// //        JFrame frame = new JFrame();
// //        frame.getLayeredPane().add(label,10);
// //        JPanel jp=(JPanel)frame.getContentPane();
// //        jp.setOpaque(false);
        
//         JPanel mainPanel = new JPanel();
//         mainPanel.setOpaque(false);
//         BoxLayout box=new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
//         mainPanel.setLayout(box);
//         setTitle("Game");
//         setLayout(new BorderLayout());
//         mainPanel.add(Box.createVerticalStrut(300));

//         JButton startbutton=new JButton();
//         startbutton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) { 
//                 new start();
//                 dispose();
//             }
//         } );
//         ImageIcon starticon = new ImageIcon("Resource/START.png");
//         startbutton.setIcon(starticon);
//         startbutton.setBorderPainted(false);
//         startbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
//         mainPanel.add(startbutton);
//         mainPanel.add(Box.createVerticalStrut(5));
        
//         JButton helpbutton=new JButton();
//         helpbutton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) { 
//                 new help();
//             }
//         } );
        
//         ImageIcon helpicon = new ImageIcon("Resource/HELP.png");
//         helpbutton.setIcon(helpicon);
//         helpbutton.setBorderPainted(false);
//         helpbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
//         mainPanel.add(helpbutton);
//         mainPanel.add(Box.createVerticalStrut(5)); 
        
//         JButton endbutton=new JButton();
//         endbutton.addActionListener( new ActionListener() {  
//             public void actionPerformed(ActionEvent e) { 
//                 System.exit(0);
//             }
//         } );
        
//         ImageIcon exiticon = new ImageIcon("Resource/QUIT.png");
//         endbutton.setIcon(exiticon);
//         endbutton.setBorderPainted(false);
//         endbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
//         mainPanel.add(endbutton);

//         add(mainPanel);
//     }


//      class start extends JFrame{
//          public start(){
//             game=new GamePage();
//             game.setVisible(true);
//          }
//      }
//      class help extends JFrame{
//          public help(){
//             Rulepage rule=new Rulepage();
//             rule.setVisible(true);
//          }
//      }

//   }
