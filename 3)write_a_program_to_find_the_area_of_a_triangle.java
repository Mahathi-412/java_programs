import java.lang.Math;
class AreaOfTriangle {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle is: " +area);
}
}
