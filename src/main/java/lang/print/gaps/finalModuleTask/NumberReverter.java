package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int x;
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            System.out.print(x);
        }
    }
}
