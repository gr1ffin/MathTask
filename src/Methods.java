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
    public static void cubeSurface() {
        varOutput = 2 * ((MathGUI.w * MathGUI.l) + (MathGUI.h * MathGUI.l) + (MathGUI.h + MathGUI.l));
    }
    public static void sphereSurface() {
        varOutput = 4 * Math.PI * Math.pow(MathGUI.r, 2);
    }
    public static void cylinderSurface() {
        varOutput = (2 * Math.PI * MathGUI.r * MathGUI.h) + (2 * Math.PI * Math.pow(MathGUI.r, 2));
    }
    /*public static void triangleSurface() {
        varOutput = (MathGUI.b * MathGUI.h ) + (2 * MathGUI.l * MathGUI.s) + (MathGUI.l * MathGUI.b);
    }*/
}
