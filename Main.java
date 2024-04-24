import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        JFrame f=new JFrame("jon");
        Hash h=new Hash(200, 200);
        JMenuBar menuBar=new JMenuBar();
        JMenu menu=new JMenu("marg");
        JMenuItem exit=new JMenuItem("EXIT");
        menu.add(exit);
        menu.addSeparator();
        menuBar.add(menu);
        JPanel panel=new JPanel();
        JButton button=new JButton("bezan");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "mach");
            }
        });
        JPanel panel2=new JPanel();
        JLabel label=new JLabel("coding easy");
        panel2.add(label);
        f.setSize(600, 600);
        f.add(panel, BorderLayout.EAST);
        f.add(panel2, BorderLayout.WEST);
        f.setJMenuBar(menuBar);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
