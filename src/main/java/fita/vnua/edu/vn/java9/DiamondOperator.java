package fita.vnua.edu.vn.java9;

public class DiamondOperator {
	// Cú pháp Diamond với các lớp ẩn danh bên trong
    StringAppender<String> appending = new StringAppender<>() {
        @Override
        public String append(String a, String b) {
            return new StringBuilder(a).append("-").append(b)
                    .toString();
        }
    };

    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }
}