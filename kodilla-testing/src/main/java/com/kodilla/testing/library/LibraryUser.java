package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String secondName;
    String peselId;

    public LibraryUser(String firstName, String secondName, String peselId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return getFirstName().equals(that.getFirstName()) &&
                getSecondName().equals(that.getSecondName()) &&
                getPeselId().equals(that.getPeselId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getPeselId());
    }
}
