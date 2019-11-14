package latihan1;
import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;
public class Latihan1 extends JFrame {
    JButton nButton = new JButton("North");
    JButton sButton = new JButton("South");
    JButton eButton = new JButton("East");
    JButton wButton = new JButton("West");
    JButton cButton = new JButton("Center");
public Latihan1() {
    super("Border Layout Beraksi");
    setSize(240, 280);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
        add(nButton, BorderLayout.NORTH);
        add(sButton, BorderLayout.SOUTH);
        add(eButton, BorderLayout.EAST);
        add(wButton, BorderLayout.WEST);
        add(cButton, BorderLayout.CENTER);
}
    public static void main(String[] args) {
        Latihan1 frame = new Latihan1();
        frame.setVisible(true);
    }
}
