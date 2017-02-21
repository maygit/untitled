package com.tmall.Exception;

/**
 * Created by 001117020012 on 2017/2/15.
 */
public class UserExistException extends RuntimeException{
    public UserExistException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserExistException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public UserExistException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public UserExistException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
}
