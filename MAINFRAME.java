import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class MAINFRAME extends JFrame{
    private JButton jbtn1=new JButton("->");
    private JButton jbtn2=new JButton("<-");
    private JButton jbtn3=new JButton("EXIT");
private JButton jbtn4[][]=new JButton[5][5];
    private Container cp;
    private JPanel jpn=new JPanel(new GridLayout(3,1,3,3));
    private JPanel jpn1=new JPanel(new GridLayout(5,5,3,3));
    private Timer t1;
    public MAINFRAME() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(100, 100);
        this.setSize(300, 500);
        cp = this.getContentPane();
cp.add(jpn, BorderLayout.NORTH);
cp.add(jpn1,BorderLayout.CENTER);

    jpn.add(jbtn1);
    jpn.add(jbtn2);
    jpn.add(jbtn3);
    for (int i=0;i<5;i++){
        for (int j=0;j<5;j++){
            jbtn4[i][j]=new JButton();
            jpn1.add(jbtn4[i][j]);
        }
    }



    }
}
