package MyGame;
        
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ResGUI extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JLabel jcomp5;

    public ResGUI(GUI myGUI, JFrame frame) {
        //construct components
        jcomp1 = new JButton ("1000x563");
        jcomp2 = new JButton ("960x544");
        jcomp3 = new JButton ("800x480");
        jcomp4 = new JButton ("Exit");
        jcomp5 = new JLabel ("");
       

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 563));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (410, 210, 130, 35);
        jcomp2.setBounds (410, 355, 130, 35);
        jcomp3.setBounds (410, 285, 130, 35);
        jcomp4.setBounds (425, 435, 105, 45);
        jcomp5.setBounds (360, 135, 240, 35);
        
        button_event(myGUI, frame);
    }


    public void button_event(GUI myGUI, JFrame frame){
        
        jcomp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               jcomp5.setText("Resolution changed to " + jcomp1.getText());
               String[] both = jcomp1.getText().split("x");
               myGUI.height = Integer.parseInt(both[0]);
               myGUI.width = Integer.parseInt(both[1]); 
            }
        });
        
        jcomp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               jcomp5.setText("Resolution changed to " + jcomp2.getText());
               String[] both = jcomp2.getText().split("x");
               myGUI.height = Integer.parseInt(both[0]);
               myGUI.width = Integer.parseInt(both[1]); 
            }
        });
        
        jcomp3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               jcomp5.setText("Resolution changed to " + jcomp3.getText());
               String[] both = jcomp3.getText().split("x");
               myGUI.height = Integer.parseInt(both[0]);
               myGUI.width = Integer.parseInt(both[1]); 
            }
        });
        
        jcomp4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               frame.dispose(); 
            }
        });
    }
}
