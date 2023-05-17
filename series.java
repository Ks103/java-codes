interface Series {
    void start();
    void next();
    void reset();
}

class OddSeries implements Series {
    private int startNumber;
    private int totalElements;
    private int currentNumber;

    public OddSeries(int startNumber, int totalElements) {
        this.startNumber = startNumber;
        this.totalElements = totalElements;
        this.currentNumber = startNumber;
    }

    @Override
    public void start() {
        currentNumber = startNumber;
    }

    @Override
    public void next() {
        currentNumber += 2;
    }

    @Override
    public void reset() {
        currentNumber = startNumber;
    }

    public void printSeries() {
        System.out.print("Odd Series: ");
        for (int i = 0; i < totalElements; i++) {
            System.out.print(currentNumber + " ");
            next();
        }
        System.out.println();
    }
}

public class OddSeriesTest {
    public static void main(String[] args) {
        OddSeries oddSeries = new OddSeries(1, 10);
        oddSeries.printSeries();
    }
}