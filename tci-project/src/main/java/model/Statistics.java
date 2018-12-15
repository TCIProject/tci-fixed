package model;

public class Statistics {
    private String algorithUsed;
    private int requestId;
    private double timeElapsed;
    private int nrOfPagesExplored;
    private int searchDepth;


    public Statistics(String algorithUsed, int nrOfPagesExplored, double timeElapsed, int searchDepth, int requestId) {
        this.algorithUsed = algorithUsed;
        this.nrOfPagesExplored = nrOfPagesExplored;
        this.timeElapsed = timeElapsed;
        this.searchDepth = searchDepth;
        this.requestId = requestId;
    }

    public String getStrategyUsed()
    {
        return algorithUsed;
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

