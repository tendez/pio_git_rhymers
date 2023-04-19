package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int RETURN = -1;
    public static final int CONS = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CONS;
    }

    public boolean isFull() {
        return total == MAX_SIZE-1;
    }

    protected int peekaBoo() {
        if (callCheck())
            return RETURN;

        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
