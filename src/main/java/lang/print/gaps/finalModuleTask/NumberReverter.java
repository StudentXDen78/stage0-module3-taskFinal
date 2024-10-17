package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int x;
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            result.append(x);
        }
        System.out.print(result);
    }
}
