class GeometryCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(5.0));          
        System.out.println(calculateArea(4, 6));         
        System.out.println(calculateArea(10.0, 8.0, true)); 
    }
}
