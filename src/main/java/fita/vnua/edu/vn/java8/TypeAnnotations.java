package fita.vnua.edu.vn.java8;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class TypeAnnotations {

    public static void main(String[] args) {
    	// Định nghĩa biến cục bộ
        @NotNull String userName = args[0];

        //Gọi hàm xây dựng
        List<String> request =
                new @NotEmpty ArrayList<>(Arrays.stream(args).collect(
                        Collectors.toList()));

        //Loại chung
        List<@Email String> emails;


    }

    //chú thích lặp lại
    @Target(value = {TYPE_USE})
    @Retention(value = RUNTIME)
    public @interface NotNull {
    }

    @Target(value = {TYPE_USE})
    @Retention(value = RUNTIME)
    public @interface NotEmpty {
    }

    @Target(value = {TYPE_USE})
    @Retention(value = RUNTIME)
    public @interface Email {
    }
}
