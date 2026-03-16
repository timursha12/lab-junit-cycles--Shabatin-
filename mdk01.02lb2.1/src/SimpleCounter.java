public class SimpleCounter {
    private int count;
    private int step;

    public SimpleCounter(int initialValue, int step) {
        this.count = initialValue;
        this.step = step;
    }

    public void increment() {
        count += step;
    }

    public void decrement() {
        count -= step;
    }

    public void reset() {
        count = 0;
    }

    public int getCount() { return count; }
    public void setStep(int step) { this.step = step; }
}
