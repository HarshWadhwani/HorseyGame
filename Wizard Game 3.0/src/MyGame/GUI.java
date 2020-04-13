package MyGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JPanel implements ActionListener{
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JFrame frame;
    public int height = 1000;
    public int width = 563;
    public Color color = Color.red;
    
    public GUI(JFrame myFrame) {
        frame = myFrame;
        //construct preComponents
        

        //construct components
        jcomp1 = new JButton ("Start");
        jcomp2 = new JButton ("Exit");
        jcomp3 = new JButton ("Change Resolution");
        jcomp4 = new JButton ("Change Block Color");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 563));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (395, 130, 200, 45);
        jcomp2.setBounds (395, 365, 200, 40);
        jcomp3.setBounds (395, 220, 200, 35);
        jcomp4.setBounds (395, 295, 200, 40);
        
        button_event(this);
        
        
    }
    
    public void button_event(GUI myGUI){
        
        jcomp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Game game = new Game(height, width, color);
                frame.dispose();
            }
        });
        
        jcomp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("fluff");
                System.exit(0);
                System.out.println("fluffer");
            }
        });
        
        jcomp3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame ("ResGUI");
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add (new ResGUI(myGUI, frame));
                frame.pack();
                frame.setVisible (true);
            }
        });
        
        jcomp4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame ("ColorGUI");
                frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add (new ColorGUI(myGUI, frame));
                frame.pack();
                frame.setVisible (true);
            }
        });
    }
    
    public static void main(String args[]) {
        JFrame frame = new JFrame ("GUI");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new GUI(frame));
        frame.pack();
        frame.setVisible (true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}