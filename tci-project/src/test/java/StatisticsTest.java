import interfaceModel.Statistics;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 *  Testing class for Movie functionality
 */
public class StatisticsTest {
    private String algorithmUsed;
    private int requestId;
    private double timeElapsed;
    private int nrOfPagesExplored;
    private int searchDepth;
    private Statistics statistics;

    /**
     * Setting up mock object with initiation data
     */
    @Before
    public void setup(){
        //arrange
        algorithmUsed = "DFS";
        requestId = 1;
        timeElapsed = 12.23;
        nrOfPagesExplored = 6;
        searchDepth = 3;
        statistics = mock(Statistics.class);
    }

    /**
     * Input test with mock object
     */
    @Test
    public void verifyStatisticsParameterInput(){
        // act
        statistics.setAlgorithmUsed(algorithmUsed);
        statistics.setRequestId(requestId);
        statistics.setTimeElapsed(timeElapsed);
        statistics.setNrOfPagesExplored(nrOfPagesExplored);
        statistics.setSearchDepth(searchDepth);
        // verify
        verify(statistics).setAlgorithmUsed(algorithmUsed);
        verify(statistics).setRequestId(requestId);
        verify(statistics).setTimeElapsed(timeElapsed);
        verify(statistics).setNrOfPagesExplored(nrOfPagesExplored);
        verify(statistics).setSearchDepth(searchDepth);
    }

    /**
     * Output test with mock object
     */
    @Test
    public void verifyReturnOfStatistics(){
        // act
        when(statistics.getStrategyUsed()).thenReturn(algorithmUsed);
        when(statistics.getRequestId()).thenReturn(requestId);
        when(statistics.getTimeElapsed()).thenReturn(timeElapsed);
        when(statistics.getNrOfpagesExplored()).thenReturn(nrOfPagesExplored);
        when(statistics.getSearchDepth()).thenReturn(searchDepth);
        // verify
        assertSame(statistics.getStrategyUsed(), algorithmUsed);
        assertSame(statistics.getRequestId(), requestId);
        assertEquals(statistics.getTimeElapsed(), timeElapsed, 0.0001);
        assertSame(statistics.getNrOfpagesExplored(), nrOfPagesExplored);
        assertSame(statistics.getSearchDepth(), searchDepth);
    }
}


