package latihan2;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
public class Latihan2 extends JFrame {
public Latihan2() {
// Membuat obyek layout manager
    FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER, 5, 10);
    // Memperoleh kontent pane dari frame
    Container container = getContentPane();
    // Mengatur layout manager dari content pane
    container.setLayout(flowlayout);
    // Menambahkan lima button ke content pane
    container.add(new JButton("Tombol 1"));
    container.add(new JButton("Tombol 2"));
    container.add(new JButton("Tombol 3"));
    container.add(new JButton("Tombol 4"));
    container.add(new JButton("Tombol 5"));
}
        public static void main(String[] args) {
        Latihan2 jendela = new Latihan2();
       jendela.setTitle("Kelas DemoFlowLayout");
       jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jendela.setSize(390, 120);
       jendela.setVisible(true);
        }
}
