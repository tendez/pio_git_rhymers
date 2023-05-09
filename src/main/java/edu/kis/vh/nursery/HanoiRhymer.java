package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

   private int totalRejected = 0;

    protected int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
