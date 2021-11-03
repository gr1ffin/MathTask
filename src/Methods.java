public class Methods {

    public static double varOutput = 0;
    MathGUI m = new MathGUI();
    public static void cubeVolume() {
        varOutput = MathGUI.l * MathGUI.w * MathGUI.h;
    }
    public static void cylinderVolume() {
        varOutput = MathGUI.h * Math.pow((MathGUI.r), 2) * Math.PI;
    }
    public static void triangleVolume() {
        varOutput = 0.5 * MathGUI.l * MathGUI.w * MathGUI.h;
    }
}
