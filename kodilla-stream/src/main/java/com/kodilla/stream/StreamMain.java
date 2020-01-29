package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> theResult = forum.getList().stream()
                .filter(forumUser->forumUser.getUserSex()=='M')
                .filter(forumUser->forumUser.getDateOfBirth().getYear()<=2000)
                .filter(forumUser->forumUser.getNumberOfPublishedPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserIdentifier, forumUser->forumUser));

                theResult.entrySet().stream()
                .map(entry->entry.getKey()+":"+ entry.getValue())
                .forEach(System.out::println);
    }
}