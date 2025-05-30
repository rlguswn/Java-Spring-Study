package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Hello");
        helloLombok.setAge(30);
        System.out.println("Name: " + helloLombok.getName() + ", Age: " + helloLombok.getAge());
        System.out.println(helloLombok.toString());
    }
}
