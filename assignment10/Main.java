import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{ 
    JComboBox jcb;
    JLabel l;
    JButton b;
    
    Main(){  
        setTitle("Student ComboBox Demonstration ");
        setLayout(new FlowLayout());
        String language[]={"Ankita Sahoo","Pariseema Routray","Chadrakant Jene","Priyanka Mittal","Ipsita Pattnayak", "Dinesh Rout" };
      
        jcb=new JComboBox(language);
        l=new JLabel();
        
        b=new JButton("SHOW");
        add(jcb);
        add(l);
        add(b);
        b.addActionListener(this);
        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        l.setText("Selected Student:"+jcb.getItemAt(jcb.getSelectedIndex()));  
    }
    
    public static void main(String []args) {  
        new Main();  
    }
}
