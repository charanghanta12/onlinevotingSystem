import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotingPage extends JFrame implements ActionListener {
    public VotingPage() {
        setTitle("AP VOTING");
        setBounds(200, 200, 1300, 700);
        getContentPane().setBackground((Color.BLACK));

        JLabel L1 = new JLabel("READ INSTRUCTIONS CAREFULLY");
        L1.setForeground(Color.RED);
        L1.setFont(new Font("Tahoma", Font.BOLD, 30));
        L1.setBounds(400, 20, 600, 100);
        L1.setLayout(null);
        add(L1);

        JLabel L2 = new JLabel("1. Please select your preferred candidate from the options provided.");
        L2.setForeground(Color.YELLOW);
        L2.setFont(new Font("Tahoma", Font.BOLD, 20));
        L2.setBounds(100, 100, 1000, 30);
        L2.setLayout(null);
        add(L2);

        JLabel L3 = new JLabel("2. You can only vote once. Multiple votes will be disqualified.");
        L3.setForeground(Color.YELLOW);
        L3.setFont(new Font("Tahoma", Font.BOLD, 20));
        L3.setBounds(100, 150, 1000, 30);
        L3.setLayout(null);
        add(L3);

        JLabel L4 = new JLabel("3. Click on the 'NEXT' button to proceed to the voting page.");
        L4.setForeground(Color.YELLOW);
        L4.setFont(new Font("Tahoma", Font.BOLD, 20));
        L4.setBounds(100, 200, 1000, 30);
        L4.setLayout(null);
        add(L4);

        JLabel L5 = new JLabel("4. Please ensure that you have a stable internet connection before voting.");
        L5.setForeground(Color.YELLOW);
        L5.setFont(new Font("Tahoma", Font.BOLD, 20));
        L5.setBounds(100, 250, 1000, 30);
        L5.setLayout(null);
        add(L5);

        JLabel L6 = new JLabel("5. If you face any issues or have any concerns, please contact the administrator.");
        L6.setForeground(Color.YELLOW);
        L6.setFont(new Font("Tahoma", Font.BOLD, 20));
        L6.setBounds(100, 300, 1000, 30);
        L6.setLayout(null);
        add(L6);

        JButton B1 = new JButton("NEXT");
        B1.setForeground(Color.BLACK);
        B1.setBackground(Color.GREEN);
        B1.setBounds(850, 550, 200, 50);
        B1.setFont(new Font("Tahoma", Font.BOLD, 30));
        B1.addActionListener(this);
        B1.setLayout(null);
        add(B1);
        
        
        JButton contactButton = new JButton("Contact Us");
        contactButton.setForeground(Color.WHITE);
        contactButton.setBackground(Color.BLUE);
        contactButton.setBounds(1100, 550, 150, 50);
        contactButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "If you have any concerns or issues, please contact us at Charanghanta17@gmail.com.");
            }
        });
        add(contactButton);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VotingPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Vote().setVisible(true);
        
    }
}
