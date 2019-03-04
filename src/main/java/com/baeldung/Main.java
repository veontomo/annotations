package com.baeldung;

public class Main {

    public static void main(String[] args) throws JsonSerializeException {
        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        System.out.println(serializer.serialize(car));
    }

}
