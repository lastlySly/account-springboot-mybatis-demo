package cn.lastlysly.handler;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-05-19 16:09
 **/
public class MyCustomException extends Exception {
    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

    public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
