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
        double a = MathGUI.ba;
        double b = MathGUI.bb;
        double c = MathGUI.bc;
        varOutput = 0.25 * MathGUI.h * Math.sqrt((- Math.pow(a, 4) + (2 * Math.pow(a * b, 2)) + (2 *(Math.pow(a * c, 2))) - (Math.pow(b, 4)) + (2 * (Math.pow(b * c, 2))) - Math.pow(c, 4)));
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
    public static void triangleSurface() {
        double a = MathGUI.ba;
        double b = MathGUI.bb;
        double c = MathGUI.bc;
        double s = ((a + b + c)/2);
        double aOfB = Math.sqrt(s * (s-a)*(s-b)*(s-c));
        varOutput = (2*aOfB) + ((a+b+c)*MathGUI.h);
    }
}
