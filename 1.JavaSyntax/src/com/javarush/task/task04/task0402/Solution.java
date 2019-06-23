package com.javarush.task.task04.task0402;

/* 
Цена яблок
*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //apple.addPrice(50);
        Apple apple2 = new Apple();
        //apple2.addPrice(100);
        Tomato apple3 = new Tomato();
        apple3.tomatoPrice(400);
        //System.out.println("Стоимость яблок " + Apple.applesPrice);
        System.out.println("Стоимость яблок " + Tomato.tomato);
    }
    public static class Tomato {
        public static int tomato = 0;
        public static void tomatoPrice(int tomato){
        Tomato.tomato+=tomato;
        }
    }
    public static class Apple {
        public static int applesPrice = 40;
        public static void addPrice(int applesPrice) {
            //напишите тут ваш код
            //Apple.applesPrice = Apple.applesPrice + applesPrice;
            //Apple.applesPrice+=applesPrice;


        }
    }
}
