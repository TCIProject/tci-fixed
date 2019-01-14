package model;

/**
 * This class will keep track of the statistics
 */
public class Statistics {
    private String algorithmUsed;
    private int requestId;
    private double timeElapsed;
    private int nrOfPagesExplored;
    private int searchDepth;


    public Statistics(String algorithmUsed, int nrOfPagesExplored, double timeElapsed, int searchDepth, int requestId) {
        this.algorithmUsed = algorithmUsed;
        this.nrOfPagesExplored = nrOfPagesExplored;
        this.timeElapsed = timeElapsed;
        this.searchDepth = searchDepth;
        this.requestId = requestId;
    }

    public void setAlgorithmUsed(String algorithmUsed) {
        this.algorithmUsed = algorithmUsed;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setTimeElapsed(double timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public void setNrOfPagesExplored(int nrOfPagesExplored) {
        this.nrOfPagesExplored = nrOfPagesExplored;
    }

    public void setSearchDepth(int searchDepth) {
        this.searchDepth = searchDepth;
    }

    public String getStrategyUsed()
    {
        return algorithmUsed;
    }

    public int getNrOfpagesExplored()
    {
        return nrOfPagesExplored;
    }

    public double getTimeElapsed()
    {
        return timeElapsed;
    }

    public int getSearchDepth()
    {
        return searchDepth;
    }

    public int getRequestId()
    {
        return requestId;
    }
}

