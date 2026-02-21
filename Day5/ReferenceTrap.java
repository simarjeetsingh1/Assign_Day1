class Box {
    int width;
    int height;
    int depth;
}

public class ReferenceTrap {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.width = 10;

        Box b2 = b1;  

        b2.width = 50;

        System.out.println(b1.width); 
    }
}
