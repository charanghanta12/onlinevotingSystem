import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vote extends JFrame implements ActionListener {
   JButton B1,B2,B3,B4,B5;
    int a,b,c,d;
    public Vote(){
        setTitle("AP VOTING");
        setBounds(200,200,1300,700);
        getContentPane().setBackground((Color.BLACK));


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("download (2).jpeg"));
        Image i2=i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel  L3=new JLabel(i3);
        L3.setBounds(110,50,200,200);
        add(L3);

        B1=new JButton("vote");
        B1.setForeground(Color.BLACK);
        B1.setBackground(Color.YELLOW);
        B1.setBounds(130,280,150,50);
        B1.setFont(new Font("Tahoma",Font.BOLD,30));
        B1.addActionListener(this);
        B1.setLayout(null);
        add(B1);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("download (1).jpeg"));
        Image i5=i4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel  L2=new JLabel(i6);
        L2.setBounds(380,50,200,200);
        add(L2);

        B2=new JButton("vote");
        B2.setForeground(Color.BLACK);
        B2.setBackground(Color.RED);
        B2.setBounds(400,280,150,50);
        B2.setFont(new Font("Tahoma",Font.BOLD,30));
        B2.addActionListener(this);
        B2.setLayout(null);
        add(B2);

        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("download.png"));
        Image im2=im1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon im3=new ImageIcon(im2);
        JLabel  L5=new JLabel(im3);
        L5.setBounds(680,50,200,200);
        add(L5);

        B3=new JButton("vote");
        B3.setForeground(Color.BLACK);
        B3.setBackground(Color.ORANGE);
        B3.setBounds(700,280,150,50);
        B3.setFont(new Font("Tahoma",Font.BOLD,30));
        B3.addActionListener(this);
        B3.setLayout(null);
        add(B3);


        ImageIcon im4=new ImageIcon(ClassLoader.getSystemResource("download (1).png"));
        Image im5=im4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon im6=new ImageIcon(im5);
        JLabel  L6=new JLabel(im6);
        L6.setBounds(950,50,200,200);
        add(L6);

        B4=new JButton("vote");
        B4.setForeground(Color.BLACK);
        B4.setBackground(Color.GREEN);
        B4.setBounds(970,280,150,50);
        B4.setFont(new Font("Tahoma",Font.BOLD,30));
        B4.addActionListener(this);
        B4.setLayout(null);
        add(B4);

        B5=new JButton("RESULTS");
        B5.setForeground(Color.BLACK);
        B5.setBackground(Color.BLUE);
        B5.setBounds(1000,560,180,50);
        B5.setFont(new Font("Tahoma",Font.BOLD,30));
        B5.addActionListener(this);
        B5.setLayout(null);
        add(B5);

        




        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("vote1.jpg"));
        Image i8=i7.getImage().getScaledInstance(500, 150,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel  L1=new JLabel(i9);
        L1.setBounds(320,500,700,200);
        add(L1);



        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Vote();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B1){
            a=a+1;
            JOptionPane.showMessageDialog(null,"Your vote for TDP has been successfully recorded.");
        } else if(e.getSource()==B2){
            b=b+1;
            JOptionPane.showMessageDialog(null,"Your vote for Janasena has been successfully recorded.");
        } else if(e.getSource()==B3){
            c=c+1;
            JOptionPane.showMessageDialog(null,"Your vote for BJP has been successfully recorded.");
        } else if(e.getSource()==B4){
            d=d+1;
            JOptionPane.showMessageDialog(null,"Your vote for Cong has been successfully recorded.");
        } else if(e.getSource()==B5){
            int maxVotes = Math.max(Math.max(a, b), Math.max(c, d));
            String winner = "";
            if (a == maxVotes && b != maxVotes && c != maxVotes && d != maxVotes) {
                winner = "TDP";
                JOptionPane.showMessageDialog(null, "Election Results - " + winner + " wins!", "Results", JOptionPane.INFORMATION_MESSAGE);
            } else if (b == maxVotes && a != maxVotes && c != maxVotes && d != maxVotes) {
                winner = "Janasena";
                JOptionPane.showMessageDialog(null, "Election Results - " + winner + " wins!", "Results", JOptionPane.INFORMATION_MESSAGE);
            } else if (c == maxVotes && a != maxVotes && b != maxVotes && d != maxVotes) {
                winner = "BJP";
                JOptionPane.showMessageDialog(null, "Election Results - " + winner + " wins!", "Results", JOptionPane.INFORMATION_MESSAGE);
            } else if (d == maxVotes && a != maxVotes && b != maxVotes && c != maxVotes) {
                winner = "CONG";
                JOptionPane.showMessageDialog(null, "Election Results - " + winner + " wins!", "Results", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Election Results - It's a tie!", "Results", JOptionPane.INFORMATION_MESSAGE);
            }
            
            JLabel r1 = new JLabel("TDP: " + a);
            JLabel r2 = new JLabel("Janasena: " + b);
            JLabel r3 = new JLabel("BJP: " + c);
            JLabel r4 = new JLabel("CONG: " + d);
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(r1);
            panel.add(r2);
            panel.add(r3);
            panel.add(r4);
    
            JOptionPane.showMessageDialog(null, panel, "Vote Count", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    
    }
    
    
   