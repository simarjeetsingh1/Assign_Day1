class VarargsAverage {

    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) return 0;

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateAverage(10, 20));
        System.out.println(calculateAverage(10, 20, 30, 40));
    }
}
