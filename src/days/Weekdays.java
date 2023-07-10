/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

import java.util.Scanner;

enum Weekdays {
    ONE("Sunday"),
    TWO("Monday"),
    THREE("Tuesday"),
    FOUR("Wednesday"),
    FIVE("Thursday");

    private String name;

    Weekdays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

