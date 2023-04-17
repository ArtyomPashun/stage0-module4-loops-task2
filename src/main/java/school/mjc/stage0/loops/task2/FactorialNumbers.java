package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int temp = 1;
        int result = 1;
        System.out.println(result);
        while (printToInclusive >= 1) {
            result = result * temp;
            System.out.println(result);
            temp++;
            printToInclusive--;
        }
    }
}
