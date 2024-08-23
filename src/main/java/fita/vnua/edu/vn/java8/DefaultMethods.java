package fita.vnua.edu.vn.java8;

import java.util.Date;

public class DefaultMethods {
	
	//Phương pháp mặc định
	public interface Logging {
        void log(String message);

        default void log(String message, Date date) {
            System.out.println(date.toString() + ": " + message);
        }
    }
			
    public class LoggingImplementation implements Logging {

        @Override
        public void log(String message) {
            System.out.println(message);
        }
    }
}
