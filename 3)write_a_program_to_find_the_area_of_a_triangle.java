import java.lang.Math;

class AreaofTriangle {

    public static void main(String[] args) {

        int a = 3, b = 9, c = 18;
        double s, area;

        s = (a + b + c) / 2;

        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle is: " + area);

}
}
