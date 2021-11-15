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
    private JTextField cubeB2;
    private JTextField cubeB3;
    private JTextField sphere1;
    private JTextField cylinderB1;
    private JTextField cylinderB2;
    private JTextField triangleB1;
    private JTextField triangleB2;
    private JTextField triangleB3;
    private JTextField triangleB4;
    private JTextField cubeB1;
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
    private JTextArea statement4;
    private JTextArea statement5;
    private JTextArea statement6;
    private JTextArea statement7;
    private JTextField triangleA4;
    private JTextArea calcText;
    private JButton divide;
    private JButton power;
    private JButton minus;
    private JButton multi;
    private JButton plus;
    private JButton cubed;
    private JButton equals;
    private JButton squared;
    private JButton clearButton;
    private JButton pastUp;
    private JButton pastDown;
    private JTextField triangleB5;

    public static double l = 0;
    public static double w = 0;
    public static double h = 0;
    public static double r = 0;
    public static double ba = 0;
    public static double bb = 0;
    public static double bc = 0;
    public static String toDo;


    public MathGUI() {
        cubeButton1.addActionListener(e -> {
            l = Double.parseDouble(cubeA1.getText());
            w = Double.parseDouble(cubeA2.getText());
            h = Double.parseDouble(cubeA3.getText());
            GeoMethods.cubeVolume();
            System.out.println(GeoMethods.varOutput);
            statement1.setText(String.valueOf(GeoMethods.varOutput));
        });
        cylinderButton1.addActionListener(e -> {
            r = Double.parseDouble(cylinderA1.getText());
            h = Double.parseDouble(cylinderA2.getText());
            GeoMethods.cylinderVolume();
            System.out.println(GeoMethods.varOutput);
            statement2.setText(String.valueOf(GeoMethods.varOutput));
        });
        triangleButton1.addActionListener(e -> {
            h = Double.parseDouble(triangleA1.getText());
            bc = Double.parseDouble(triangleA2.getText());
            bb = Double.parseDouble(triangleA3.getText());
            ba = Double.parseDouble(triangleA4.getText());
            GeoMethods.triangleVolume();
            System.out.println(GeoMethods.varString);
            statement3.setText(String.valueOf(GeoMethods.varString));
        });
        cubeButton2.addActionListener(e -> {
            l = Double.parseDouble(cubeB1.getText());
            w = Double.parseDouble(cubeB2.getText());
            h = Double.parseDouble(cubeB3.getText());
            GeoMethods.cubeSurface();
            System.out.println(GeoMethods.varOutput);
            statement4.setText(String.valueOf(GeoMethods.varOutput));
        });
        sphereButton.addActionListener(e -> {
            r = Double.parseDouble(sphere1.getText());
            GeoMethods.sphereSurface();
            System.out.println(GeoMethods.varOutput);
            statement5.setText(String.valueOf(GeoMethods.varOutput));
        });
        cylinderButton2.addActionListener(e -> {
            r = Double.parseDouble(cylinderB1.getText());
            h = Double.parseDouble(cylinderB2.getText());
            GeoMethods.cylinderSurface();
            System.out.println(GeoMethods.varOutput);
            statement6.setText(String.valueOf(GeoMethods.varOutput));
        });
        triangleButton.addActionListener(e -> {
            h = Double.parseDouble(triangleB1.getText());
            ba = Double.parseDouble(triangleB2.getText());
            bb = Double.parseDouble(triangleB3.getText());
            bc = Double.parseDouble(triangleB4.getText());
            GeoMethods.triangleSurface();
            System.out.println(GeoMethods.varOutput);
            statement7.setText(String.valueOf(GeoMethods.varOutput));
        });
        plus.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "+";
            calcText.setText("");
        });
        minus.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "-";
            calcText.setText("");
        });
        multi.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "*";
            calcText.setText("");
        });
        divide.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "/";
            calcText.setText("");
        });
        power.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "^";
            calcText.setText("");
        });
        squared.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "sq";
        });
        cubed.addActionListener(e -> {
            AlgMethods.inpA = Double.parseDouble(calcText.getText());
            toDo = "cu";
        });
        equals.addActionListener(e -> {
            AlgMethods.inpB = Double.parseDouble(calcText.getText());
            AlgMethods.calcMethod();
            calcText.setText(String.valueOf(AlgMethods.answer));
        });
        clearButton.addActionListener(e -> {
            AlgMethods.inpA = 0;
            AlgMethods.inpB = 0;
            AlgMethods.answer = 0;
            calcText.setText("");
        });
        pastUp.addActionListener(e -> {
            AlgMethods.pastGet += 1;
            AlgMethods.pastAnswers();
            calcText.setText(AlgMethods.toSet);
        });
        pastDown.addActionListener(e -> {
            AlgMethods.pastGet -= 1;
            AlgMethods.pastAnswers();
            calcText.setText(AlgMethods.toSet);
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
        frame.getRootPane().setDefaultButton(m.equals);
    }
}