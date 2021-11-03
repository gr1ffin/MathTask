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
    private JTextField cylinder1;
    private JTextField cylinder2;
    private JTextField cube1;
    private JTextField cube2;
    private JTextField cube3;
    private JTextField triangle1;
    private JTextField triangle2;
    private JTextField triangle3;
    private JTabbedPane tabbedPane5;
    private JPanel sur1;
    private JPanel sur2;
    private JPanel sur3;
    private JPanel sur4;
    private JPanel sur5;
    private JTextField cubeB2;
    private JTextField cubeB3;
    private JTextField sphere1;
    private JTextField cylinderB1;
    private JTextField cylinderB2;
    private JTextField triangleB1;
    private JTextField triangleB2;
    private JTextField triangleB3;
    private JTextField triangleB4;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField cubeB1;


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
