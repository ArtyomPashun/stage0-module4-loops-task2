package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int primeCheckNumber;
        int divisibleCount;
        int counter = 0;
        if (printToInclusive == 0) {
            System.out.print("");
        } else {
            while (counter <= printToInclusive) {
                divisibleCount = 0;
                primeCheckNumber = 2;
                while (primeCheckNumber <= counter / 2) {
                    if (counter % primeCheckNumber == 0) {
                        divisibleCount++;
                        break;
                    }
                    primeCheckNumber++;
                }
                if (divisibleCount == 0 && counter > 1) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
