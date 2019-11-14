package latihan3;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;
public class Latihan3 extends JFrame {
    JButton Marcia = new JButton("Marcia");
    JButton Carol = new JButton("Carol");
    JButton Greg = new JButton("Greg");
    JButton Jan = new JButton("Jan");
    JButton Alice = new JButton("Alice");
    JButton Peter = new JButton("Peter");
    JButton Cindy = new JButton("Cindy");
    JButton Mike = new JButton("Mike");
    JButton Bobby = new JButton("Bobby");
public Latihan3() {
    super("Grid Layout Beraksi");
    setSize(260, 260);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    
    GridLayout family = new GridLayout(3, 3, 10, 10);
    pane.setLayout(family);
    pane.add(Marcia); pane.add(Carol);
    pane.add(Greg); pane.add(Jan);
    pane.add(Alice); pane.add(Peter);
    pane.add(Cindy); pane.add(Mike);
    pane.add(Bobby);
    add(pane);
    setVisible(true);
}
    public static void main(String[] args) {
        Latihan3 frame = new Latihan3();
    }
}
