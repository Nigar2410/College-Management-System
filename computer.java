package data;
import javax.swing.*;
import java.awt.*;


public class computer extends JFrame
{
    public computer()
    {
        
       FlowLayout  f1=new FlowLayout();
       setLayout(f1);
       ImageIcon ii=new ImageIcon("computer.jpg");
       JLabel L1=new JLabel(ii);
      // L1.setBounds(250,250,150,40);
      //L1.setBounds(100,100,100,100);
       add(L1); 
    }

    public static void main(String args[])
    {
            computer c1=new computer();
            c1.setVisible(true);
            c1.setTitle("");
            c1.setSize(500,500);

    }
}