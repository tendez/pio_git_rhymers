package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int RETURN = -1;
    private static final int CONS = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == CONS;
    }

    protected boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return RETURN;

        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
