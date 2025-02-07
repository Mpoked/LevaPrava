import javax.swing.*;

public class LevePrave extends JFrame{
    private JButton btLeva;
    private JButton btPrava;
    private JPanel pnMain;

    public LevePrave() {
        initComponent();
    }

    private void initComponent() {
        setContentPane(pnMain);
        setTitle("LevaPrava");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btLeva.addActionListener(e -> leva());
        btPrava.addActionListener(e -> prava());
    }

    private void leva() {
        JOptionPane.showMessageDialog(this, "levá");
    }
    private void prava() {
        JOptionPane.showMessageDialog(this, "pravá");
    }
}
