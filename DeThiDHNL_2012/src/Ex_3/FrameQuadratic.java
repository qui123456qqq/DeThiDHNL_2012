package Ex_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameQuadratic extends JFrame implements ActionListener {
    JPanel panel_Main, panel_Function, panel_Chose;
    JLabel mainLabel, labelA, labelB, labelC;
    JTextField textFieldA, textFieldB, textFieldC;
    JLabel labelResult;
    JButton buttonSolve, buttonClose;

    public FrameQuadratic() {
        this.setTitle("Solve Quadractic Equation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        initQuandratic();
        action();
        this.setVisible(true);
    }

    private void initQuandratic() {
        panel_Main = new JPanel();
        panel_Main.setLayout(new FlowLayout());
        mainLabel = new JLabel("Enter factor of equation");
        mainLabel.setFont(new Font("Time new roman", Font.BOLD, 20));
        panel_Main.add(mainLabel);
        this.add(panel_Main, BorderLayout.NORTH);

        panel_Function = new JPanel();
        panel_Function.setLayout(new GridLayout(4, 2));
        labelA = new JLabel("Enter number a");
        labelB = new JLabel("Enter number b");
        labelC = new JLabel("Enter number c");

        textFieldA = new JTextField();
        textFieldA.setSize(20, 5);
        textFieldB = new JTextField();
        textFieldC = new JTextField();
        buttonSolve = new JButton("Solve");
        labelResult = new JLabel("");
        panel_Function.add(labelA);
        panel_Function.add(textFieldA);
        panel_Function.add(labelB);
        panel_Function.add(textFieldB);
        panel_Function.add(labelC);
        panel_Function.add(textFieldC);
        panel_Function.add(buttonSolve);
        panel_Function.add(labelResult);
        this.add(panel_Function, BorderLayout.CENTER);

        panel_Chose = new JPanel();
        panel_Chose.setLayout(new BorderLayout());
        buttonClose = new JButton("Close");
        panel_Chose.add(buttonClose);
        this.add(panel_Chose, BorderLayout.SOUTH);
    }

    public void action() {
        buttonSolve.addActionListener(this);
        buttonClose.addActionListener(this);
    }

    public String solveTheEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        String result = null;
        if (a == 0) {
            if (b == 0) {
                result = "Phương trình vô nghiệm";
            } else
                result = "X = " + (-c / b);
        }
        double x1, x2;
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
            result = "X1 = " + x1 + "\t " + "X2 = " + x2;
        }
        if (delta == 0) {
            x1 = (-b / (2 * a));
            result = "X = " + x1;
        } else
            result = "Phương trình vô nghiệm";
        return result;
    }
    private boolean validateForm(){
        if (textFieldA.getText().isEmpty()||textFieldC.getText().isEmpty()||textFieldB.getText().isEmpty())
            return false;
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonClose) {
            System.exit(0);
        }
        if (e.getSource() == buttonSolve) {
            if (!validateForm()){
                JOptionPane.showMessageDialog(this,"Vui lòng nhập đầy đủ a,b,c");
            }else {
                double a = Double.parseDouble(textFieldA.getText());
                double b = Double.parseDouble(textFieldB.getText());
                double c = Double.parseDouble(textFieldC.getText());
                double delta = (b * b) - (4 * a * c);
                String result = "";
                if (a == 0) {
                    if (b == 0) {
                        result = "Phương trình vô nghiệm";
                    } if (b > 0 || b < 0)
                        result = "X = " + (-c / b);
                }
                double x1, x2;
                if (delta > 0) {
                    x1 = ((-b + Math.sqrt(delta)) / (2 * a));
                    x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                    result = "X1 = " + x1 + "\t " + " ;X2 = " + x2 ;
                }
                if (delta == 0) {
                    x1 = (-b / (2 * a));
                    result = "X = " + x1;
                }  if (delta < 0)
                    result = "Phương trình vô nghiệm";

                labelResult.setText(result);
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldC.setText("");
            }

        }
    }

//    public static void main(String[] args) {
//        new FrameQuadratic();
//    }
}
