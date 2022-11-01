package PROJECT1;

import javax.swing.JFrame;

public class q1 extends JFrame {
    q1() {
        setTitle("Let's study Java");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new q1();
    }
}