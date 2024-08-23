package fita.vnua.edu.vn.java8;

import fita.vnua.edu.vn.java8.RepeatingAnnotations.Notify;

//Sử dụng chú thích lặp lại
@Notify(email = "admin@company.com")
@Notify(email = "owner@company.com")
public class UserNotAllowedForThisActionException
        extends RuntimeException {
    final String user;

    public UserNotAllowedForThisActionException(String user) {
        this.user = user;

    }
}
