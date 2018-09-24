
package usersdatabase;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Usersdatabase {
    private JLabel namelable,passwordlabel;
    private JTextField name ,password;
    private JButton login;
    private JPanel mypanel;

    public static void main(String[] args) {
        JFrame myframe=new JFrame("LOGIN HERE");
        JPanel mypanel=new JPanel();
        JLabel namelabel=new JLabel("USERNAME:");
        JTextField name=new JTextField();
        name.setColumns(16);
        JLabel passwordlabel=new JLabel("PASSWORD:");
        JTextField password=new JTextField();
        password.setColumns(16);
        JButton login=new JButton("LOGIN");
         login.setText("Login");
        JButton clear=new JButton("CLEAR");
         clear.setText("Clear");
        mypanel.add(namelabel);
        mypanel.add(name);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(clear);
        mypanel.add(login);
        myframe.add(mypanel);
        myframe.setSize(400,300);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        namelabel.setBounds(80,65,100,20);
        
        
        mypanel.setLayout(new GridLayout(0,1));
       
        
    }
     
    }
    
}
