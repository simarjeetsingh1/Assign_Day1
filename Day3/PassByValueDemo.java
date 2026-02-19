class PassByValueDemo {

    public static void modifyPrimitive(int x) {
        x = 99;
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int a = 10;
        int[] b = {10, 20};

        modifyPrimitive(a);
        modifyArray(b);

        System.out.println(a);      // 10
        System.out.println(b[0]);   // 99
    }
}
