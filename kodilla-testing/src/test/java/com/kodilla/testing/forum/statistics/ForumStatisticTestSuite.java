package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite: begin");

    }
    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite:end");
    }
    @Test
    public void testForumStatisticsWithMock100Users(){
        //given
        Statistics statisticsMock=mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic (statisticsMock);
        List<String> actualUsersNames = new ArrayList<String>();
        for (int i=0; i<100; i++) {
            actualUsersNames.add("Darek");
        }
        when(statisticsMock.usersNames()).thenReturn(actualUsersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();
        //then
        Assert.assertEquals(100, actualUsersNames.size());
        System.out.println("Number of users "+actualUsersNames.size());
    }

    @Test
    public void testForumStatisticsWithMock0Users() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<String> actualUsersNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(actualUsersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();
        //then
        Assert.assertEquals(0, actualUsersNames.size());
        System.out.println("Number of users " + actualUsersNames.size());
    }
    @Test
    public void testForumStatisticsWithMock2Users() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<String> actualUsersNames = new ArrayList<String>();
            actualUsersNames.add("Darek");
            actualUsersNames.add("Marek");
        when(statisticsMock.usersNames()).thenReturn(actualUsersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        forumStatistic.showStatistics();
        //then
        Assert.assertEquals(2,actualUsersNames.size());
        System.out.println("Number of users " + actualUsersNames.size());
    }
}
