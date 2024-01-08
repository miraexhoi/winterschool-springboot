package com.mysite.springboot;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HelloLombok {
    private final String hello;
    private final int lombok;

    // final : 불변

    public HelloLombok(String hello, int lombok) {
        this.hello = hello;
        this.lombok = lombok;
    }

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
