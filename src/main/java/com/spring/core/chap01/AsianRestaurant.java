package com.spring.core.chap01;

public class AsianRestaurant implements Restaurant{

    private KimuraChef chef = new KimuraChef();
    private SusiCourse course = new SusiCourse();
    public void order() {
        System.out.println("스시 오마카세를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }

}
