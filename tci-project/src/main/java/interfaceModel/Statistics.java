package interfaceModel;

public interface Statistics {
    void setAlgorithmUsed(String algorithmUsed);

    void setRequestId(int requestId);

    void setTimeElapsed(double timeElapsed);

    void setNrOfPagesExplored(int nrOfPagesExplored);

    void setSearchDepth(int searchDepth);

    String getStrategyUsed();

    int getNrOfpagesExplored();

    double getTimeElapsed();

    int getSearchDepth();

    int getRequestId();
}
