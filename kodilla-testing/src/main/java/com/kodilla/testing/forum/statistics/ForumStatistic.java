package com.kodilla.testing.forum.statistics;

public class ForumStatistic {
    int averagePostsCount;
    int averageCommentsCount;
    int averageCommentsPerPosts;
    Statistics statistics;

    public ForumStatistic(Statistics statistics) {
        this.statistics = statistics;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() != 0) {
            averagePostsCount = statistics.postsCount() / statistics.usersNames().size();
        } else {
            averagePostsCount = 0;
        }
        if (statistics.usersNames().size() != 0) {
            averageCommentsCount = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averageCommentsCount = 0;
        }
        if (statistics.postsCount() != 0) {
            averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();
        } else {
            averageCommentsPerPosts = 0;
        }
    }
    public void showStatistics(){
        System.out.println("Average posts per forum user "+ averagePostsCount);
        System.out.println("Average comments per forum user "+averageCommentsCount);
        System.out.println("Average comments per post "+ averageCommentsPerPosts);
    }
}

