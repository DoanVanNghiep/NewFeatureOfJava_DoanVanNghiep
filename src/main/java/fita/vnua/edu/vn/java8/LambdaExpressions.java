package fita.vnua.edu.vn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {
	
	// Sử dụng Stream và Lambda Expression
	public static List<Car> findCarsUsingLambda(List<Car> cars) {
        return cars.stream().filter(car -> car.kilometers < 50000)
                .collect(Collectors.toList());
    }

	// trước khi có biểu thức Lambda
    public static List<Car> findCarsOldWay(List<Car> cars) {
        List<Car> selectedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.kilometers < 50000) {
                selectedCars.add(car);
            }
        }
        return selectedCars;
    }
    
    public class Car {
        public String model;
        public double kilometers;
    }

}
