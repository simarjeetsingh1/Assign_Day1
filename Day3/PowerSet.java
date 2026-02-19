class PowerSet {

    public static void generate(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        generate(str, current + str.charAt(index), index + 1); 
        generate(str, current, index + 1); 
    }

    public static void main(String[] args) {
        generate("abc", "", 0);
    }
}
