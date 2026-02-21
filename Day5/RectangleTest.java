class Rectangle {
    int length;
    int width;

    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1.length + "," + r1.width);
        System.out.println(r2.length + "," + r2.width);
        System.out.println(r3.length + "," + r3.width);
    }
}
