package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {
    @Test
    public void testForumStatisticsWithMock1(){
        //given
        Statistics statisticsMock=mock(Statistics.class);
        List<String> actualUsersNames = new ArrayList<String>();
        actualUsersNames.add("Darek");
        actualUsersNames.add("Marek");
        actualUsersNames.add("Jarek");
        when(statisticsMock.getStatisticsUsersNames()).thenReturn(actualUsersNames);

        ForumStatistic forumStatistics = new ForumStatistic (statisticsMock);
        //when
        forumStatistics.calculateAdvStatistics().size();
        //then
        Assert.assertEquals(3, forumStatistics.calculateAdvStatistics().size());
    }
}
