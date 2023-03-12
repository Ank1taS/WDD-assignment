import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class index extends JFrame{
    index(){
        setTitle("menubar");
        setLayout(new FlowLayout());
        
        JMenu j1,j3;
        JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
        JMenuBar jb;
        
        j1=new JMenu("File");
        j3=new JMenu("Edit");
        
        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Save As");
        i5=new JMenuItem("Rename");
        i6=new JMenuItem("Close");
        i7=new JMenuItem("Undo");
        i8=new JMenuItem("Redo");
        i9=new JMenuItem("Cut");
        i10=new JMenuItem("Copy");
        i11=new JMenuItem("Paste");
        i12=new JMenuItem("Delete");
        
        jb=new JMenuBar();
        
        j1.add(i1);
        j1.add(i2);
        j1.add(i3);
        j1.add(i4);
        j1.add(i5);
        j1.add(i6);
        j3.add(i7);
        j3.add(i8);
        j3.add(i9);
        j3.add(i10);
        j3.add(i11);
        j3.add(i12);
        jb.add(j1);
        jb.add(j3);

        setJMenuBar(jb);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String []args){
        new index();
    }
}
