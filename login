
package usersdatabase;
import javax.swing.*;

public class Usersdatabase {

    public static void main(String[] args) {
        JFrame myframe=new JFrame("LOGIN HERE");
        JPanel mypanel=new JPanel();
        JLabel namelabel=new JLabel("USERNAME:");
        JLabel passwordlabel=new JLabel("PASSWORD:");
        JTextField name=new JTextField();
        name.setColumns(16);
        JTextField password=new JTextField();
        password.setColumns(16);
        JButton login=new JButton("LOGIN");
        mypanel.add(namelabel);
        mypanel.add(name);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(login);
        name.setSize(100,40);
        myframe.add(mypanel);
        myframe.setSize(400,300);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
    
}
