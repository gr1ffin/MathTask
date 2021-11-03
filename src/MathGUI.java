import javax.swing.*;

public class MathGUI {
    private JPanel masterPanel;
    private JTabbedPane tabbedPane1;
    private JPanel switch2;
    private JPanel switch3;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JPanel alg1;
    private JPanel alg2;
    private JPanel geo1;
    private JPanel geo2;
    private JTabbedPane tabbedPane4;
    private JPanel vol1;
    private JPanel vol2;
    private JPanel vol3;
    private JTextArea advancedMathCalculatorWhatTextArea;


    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MathGUI gui = new MathGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(gui.masterPanel);
        frame.setSize(850, 450);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
        frame.setVisible(true);

    }
}
