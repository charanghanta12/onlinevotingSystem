import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VotingSystem extends JFrame implements ActionListener {

    VotingSystem()
    {
        setTitle("AP VOTING");
        setBounds(200,200,1300,700);
        getContentPane().setBackground(Color.BLACK);
	   


        JLabel L1=new JLabel("ONLINE VOTING SYSTEM");
        L1.setForeground(Color.RED);
        L1.setFont(new Font("Tahoma",Font.BOLD,30));
        L1.setBounds(750,20,600,100);
        L1.setLayout(null);
        add(L1);

        
        JLabel L2=new JLabel("WELCOME TO AP VOTING");
        L2.setForeground(Color.orange);
        L2.setFont(new Font("Tahoma",Font.BOLD,35));
        L2.setBounds(730,250,500,100);
        L2.setLayout(null);
        add(L2);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("button-choice-choose-decision.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel  L3=new JLabel(i3);
        L3.setBounds(-100,0,900,700);
        add(L3);

        
        JButton B1=new JButton("PROCEED");
        B1.setForeground(Color.BLACK);
        B1.setBackground(Color.GREEN);
        B1.setBounds(850,500,200,50);
        B1.setFont(new Font("Tahoma",Font.BOLD,20));
        
        B1.addActionListener(this);
        B1.setLayout(null);
        add(B1);


        setLayout(null);
        setVisible(true);
        

    }

    public static void main(String[] args){
        new VotingSystem();
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      new VotingPage().setVisible(true);
      
    }
}
