package Ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class View extends JFrame implements ActionListener {
    FrameAbout frameAbout;
    FrameQuadratic frameQuadratic;
    JMenuBar menuBar;
    JMenu menuTools, menuHelp;
    JMenuItem menuItem_Quadratic, menuItemExit, menuItemAbout;

    public View() {
        this.setTitle("My Application");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        init();
        actionEvent();
        this.setVisible(true);
    }

    private void init() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        JLabel labelHello = new JLabel("Khoa công nghệ thông tin K47");
        labelHello.setFont(new Font("Time New Roman",Font.BOLD,30));
        panel.add(labelHello);
        this.add(panel);
        menuBar = new JMenuBar();
        menuTools = new JMenu("Tools");
        menuHelp = new JMenu("Help");
        menuItem_Quadratic = new JMenuItem("Solve Quadratic Equation");
        menuItemExit = new JMenuItem("Exit");
        menuItemAbout = new JMenuItem("About");
        /*
        add
         */
        menuTools.add(menuItem_Quadratic);
        menuTools.add(menuItemExit);
        menuHelp.add(menuItemAbout);

        menuBar.add(menuTools);
        menuBar.add(menuHelp);
        this.setJMenuBar(menuBar);

        frameQuadratic = new FrameQuadratic();
        frameAbout = new FrameAbout();

    }
    private void actionEvent(){
        menuItemExit.addActionListener(this);
        menuItem_Quadratic.addActionListener(this);
//        frameQuadratic.buttonClose.addActionListener(this);
        menuItemAbout.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameQuadratic.buttonClose){
            System.exit(0);
        }if (e.getSource() == menuItemExit){
            System.exit(0);
        }if (e.getSource() == menuItem_Quadratic){
            System.out.println("You clicked");
            this.setVisible(false);
            frameQuadratic.setVisible(true);
            frameAbout.setVisible(false);
        }
        if (e.getSource() == menuItemAbout){
            System.out.println("You clicked");
            this.setVisible(false);
            frameQuadratic.setVisible(false);
            frameAbout.setVisible(true);
        }
    }
}
