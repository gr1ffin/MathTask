import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JTextField cylinderA1;
    private JTextField cylinderA2;
    private JTextField cubeA1;
    private JTextField cubeA2;
    private JTextField cubeA3;
    private JTextField triangleA1;
    private JTextField triangleA2;
    private JTextField triangleA3;
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
    private JTextField pyramid1;
    private JTextField pyramid2;
    private JTextField cubeB1;
    private JButton pyramidButton;
    private JButton cubeButton2;
    private JButton sphereButton;
    private JButton cylinderButton2;
    private JButton triangleButton;
    private JButton cubeButton1;
    private JButton cylinderButton1;
    private JButton triangleButton1;
    private JTextArea statement3;
    private JTextArea statement1;
    private JTextArea statement2;
    private JTextArea sideBaseTextArea;
    private JTextArea lengthWidthHeightTextArea2;
    private JTextArea radiusTextArea;
    private JTextArea radiusHeightTextArea2;
    private JTextArea lengthHeightSideBaseTextArea;

    public static String he = "Height";
    public static String le = "Length";
    public static String wi = "Width";
    public static String ra = "Radius";
    public static String ba = "Base";
    public static String si = "Side";

    public static double l = 0;
    public static double w = 0;
    public static double h = 0;
    public static double r = 0;
    public static double s = 0;
    public static double b = 0;



    public MathGUI() {
        cubeButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l = Double.parseDouble(cubeA1.getText());
                w = Double.parseDouble(cubeA2.getText());
                h = Double.parseDouble(cubeA3.getText());
                Methods.cubeVolume();
                System.out.println(Methods.varOutput);
                statement1.setText(String.valueOf(Methods.varOutput));
            }
        });
        cylinderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r = Double.parseDouble(cylinderA1.getText());
                h = Double.parseDouble(cylinderA2.getText());
                Methods.cylinderVolume();
                System.out.println(Methods.varOutput);
                statement2.setText(String.valueOf(Methods.varOutput));
            }
        });
        triangleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l = Double.parseDouble(cubeA1.getText());
                w = Double.parseDouble(cubeA2.getText());
                h = Double.parseDouble(cubeA3.getText());
                Methods.triangleVolume();
                System.out.println(Methods.varOutput);
                statement3.setText(String.valueOf(Methods.varOutput));

            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MathGUI m = new MathGUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(m.masterPanel);
        frame.setSize(850, 450);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
        frame.setVisible(true);

    }
}




