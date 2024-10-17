package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int x;
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            sum = sum + x;
            System.out.println(sum);
        }
    }
}
