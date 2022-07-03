package Ex_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FrameAbout extends JFrame implements ActionListener {
    JPanel panelInformation;
    JLabel label_Info;
    JButton ok_Btn;
    public FrameAbout() {
        this.setTitle("About");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        try {
            init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        action();
        this.setVisible(true);
    }

    private void init() throws IOException {
        ImageIcon i = new ImageIcon("C:\\Users\\Dell\\Pictures\\Ảnh cá nhân\\08-saturn-icon.png") ;
        JLabel wIcon = new JLabel(i);
        ok_Btn = new JButton("OK");
        SpringLayout springLayout = new SpringLayout();
        panelInformation = new JPanel();
        panelInformation.setLayout(springLayout);
        label_Info = new JLabel("Advanced programing ");
        JLabel label_1 = new JLabel("Version 1.0");
        JLabel label_2 = new JLabel("Copyright Your Name");
        JLabel label_3 = new JLabel("FIT HCMUAF");
        panelInformation.add(wIcon);
        panelInformation.add(label_Info);
        panelInformation.add(label_1);
        panelInformation.add(label_2);
        panelInformation.add(label_3);
        panelInformation.add(ok_Btn);
        springLayout.putConstraint(SpringLayout.WEST,wIcon,50,SpringLayout.WEST,panelInformation);
        springLayout.putConstraint(SpringLayout.NORTH,wIcon,50,SpringLayout.NORTH,panelInformation);
        springLayout.putConstraint(SpringLayout.WEST,label_Info,160,SpringLayout.WEST,panelInformation);
        springLayout.putConstraint(SpringLayout.NORTH,label_Info,50,SpringLayout.NORTH,panelInformation);
        springLayout.putConstraint(SpringLayout.WEST,label_1,160,SpringLayout.WEST,panelInformation);
        springLayout.putConstraint(SpringLayout.NORTH,label_1,65,SpringLayout.NORTH,panelInformation);
        springLayout.putConstraint(SpringLayout.WEST,label_2,160,SpringLayout.WEST,panelInformation);
        springLayout.putConstraint(SpringLayout.NORTH,label_2,80,SpringLayout.NORTH,panelInformation);
        springLayout.putConstraint(SpringLayout.WEST,label_3,160,SpringLayout.WEST,panelInformation);
        springLayout.putConstraint(SpringLayout.NORTH,label_3,95,SpringLayout.NORTH,panelInformation);
        springLayout.putConstraint(SpringLayout.EAST,ok_Btn,-3,SpringLayout.EAST,panelInformation);
        springLayout.putConstraint(SpringLayout.SOUTH,ok_Btn,-3,SpringLayout.SOUTH,panelInformation);
        this.add(panelInformation);
    }
    private void action() {
        ok_Btn.addActionListener(this);
    }

//    public static void main(String[] args) throws IOException {
//        new FrameAbout();
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok_Btn){
            System.exit(0);
        }
    }
}
