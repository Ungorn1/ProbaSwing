import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        frame f = new frame("Окно");
        f.setVisible(true);
        f.setSize(270,170);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
    }
}
