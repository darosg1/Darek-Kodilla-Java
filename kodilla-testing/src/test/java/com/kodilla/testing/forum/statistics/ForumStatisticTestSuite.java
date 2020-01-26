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
        //Tworzony jest mock interfejsu Statistics.
        // obiekt sztucznej klasy, ktora symuluje rzeczywistą klasę implementująca interfejs Statistics
        Statistics statisticsMock=mock(Statistics.class);
        List<String> actualUsersNames = new ArrayList<String>();
            for(int i=0; i<100; i++) {
                actualUsersNames.add("Darek");
            }
        when(statisticsMock.usersNames()).thenReturn(actualUsersNames);
        ForumStatistic forumStatistics = new ForumStatistic (statisticsMock);
        //when
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(100, forumStatistics);
        System.out.println(actualUsersNames);
    }


    /*@Test
    public void testForumStatisticsWithMock2(){
        //given
        //Tworzony jest mock interfejsu Statistics.
        // obiekt sztucznej klasy, ktora symuluje rzeczywistą klasę implementująca interfejs Statistics
        Statistics statisticsMock=mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(actualCommentsCount());
        ForumStatistic forumStatistics = new ForumStatistic (statisticsMock);
        //when
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(100,actualCommentsCount());

    }*/
}
