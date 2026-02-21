public class StringCompression {

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {

            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        String compressed = sb.toString();
        return compressed.length() < s.length() ? compressed : s;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }
}
