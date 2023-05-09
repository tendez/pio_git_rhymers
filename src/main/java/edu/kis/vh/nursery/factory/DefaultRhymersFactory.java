package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
/**
 * Default class implementing Rhymers Factory interface
 */
public class DefaultRhymersFactory implements Rhymersfactory {
    /**
     * Method creating Standard Rhymer
     * @return New Standard Rhymer
     */
    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * Method creating False Rhymer
     * @return New False Rhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * Method creating FIFO Rhymer
     * @return New FIFO Rhymer
     */
    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }
    /**
     * Method creating Hanoi Rhymer
     * @return New Hanoi Rhymer
     */
    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}
