package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
   private final int uniqueUserIdentifier;
   private final String userName;
   private final char userSex;
   private final LocalDate dateOfBirth;
   private final int numberOfPublishedPosts;

    public ForumUser(final int uniqueUserIdentifier, final String userName, final char userSex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPublishedPosts) {
        this.uniqueUserIdentifier = uniqueUserIdentifier;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUniqueUserIdentifier() {
        return uniqueUserIdentifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserIdentifier=" + uniqueUserIdentifier +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}
