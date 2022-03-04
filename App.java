import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    private static JTextField boka;
    private static JTextField bokb;
    private static JLabel pprosto;
    private static JLabel oprosto;
    public static void main(String[] args) throws Exception {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Obliczanie Prostokąta");
    frame.setSize(1000, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    
    panel.setLayout(null);
    
    JLabel label1 = new JLabel("Obliczanie Prostokąta");
    label1.setBounds(425,20,150,25);
    panel.add(label1);

    JLabel label2 = new JLabel("Bok a:");
    label2.setBounds(400,50,100,25);
    panel.add(label2);

    boka = new JTextField(20);
    boka.setBounds(450, 50, 60, 25);
    panel.add(boka);
    
    JLabel b = new JLabel("Bok b:");
    b.setBounds(400,80,100,25);
    panel.add(b);

    bokb = new JTextField(20);
    bokb.setBounds(450, 80, 60, 25);
    panel.add(bokb);
    
    pprosto = new JLabel("");
    pprosto.setBounds(300, 140, 200, 25);
    panel.add(pprosto);

    oprosto = new JLabel("");
    oprosto.setBounds(300, 170, 200, 25);
    panel.add(oprosto);
    
    JButton sprosto = new JButton("Oblicz");
    sprosto.setBounds(425, 110, 100, 25);
    sprosto.addActionListener(new App());
    panel.add(sprosto);

    frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int abok = Integer.parseInt(boka.getText());
        int bbok = Integer.parseInt(bokb.getText());
        pprosto.setText("Pole prostokąta: "+(abok*bbok));
        oprosto.setText("Obwód prostokąta: "+(abok*2+bbok*2));
    }
}
