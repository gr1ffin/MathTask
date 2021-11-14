public class GeoMethods {

    public static double varOutput = 0;
    public static String varString;
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
        double s = ((a + b + c)/2);
        double aOB = (s * (s-a)*(s-b)*(s-c));
        System.out.println(aOB);
        if (aOB > 0) {
            double aOfB = Math.sqrt(aOB);
            varString = String.valueOf(aOfB * MathGUI.h);
        } else { varString = "This is not a possible output. Please try again.";}

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
