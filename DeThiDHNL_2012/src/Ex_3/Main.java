package Ex_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new View();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
