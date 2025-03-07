package fita.vnua.edu.vn.java11;

import java.util.List;
import java.util.stream.Collectors;

public class LocalTypeVarLambda {

	//Kiểu biến cục bộ trong biểu thức Lambda
	
    public void explicitTypes() {
        var Roland = new Person("Roland", "Deschain");
        var Susan = new Person("Susan", "Delgado");
        var Eddie = new Person("Eddie", "Dean");
        var Detta = new Person("Detta", "Walker");
        var Jake = new Person("Jake", "Chambers");

        var filteredPersons =
                List.of(Roland, Susan, Eddie, Detta, Jake)
                        .stream()
                        .filter((var x) -> x.name.contains("a"))
                        .collect(Collectors.toList());
        System.out.println(filteredPersons);
    }


    public class Person {
        String name;
        String lastname;

        public Person(String name, String lastname) {
            this.name = name;
            this.lastname = lastname;
        }
    }
}