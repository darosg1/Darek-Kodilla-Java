package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Darek", 'M', 1978,2,20, 2));
        usersList.add(new ForumUser(2, "Marek", 'M', 1990,11, 2,  5));
        usersList.add(new ForumUser(3, "Krysia", 'W', 2001,1,12, 20));
        usersList.add(new ForumUser(4, "Zosia", 'W', 1999,10, 14,  21));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}