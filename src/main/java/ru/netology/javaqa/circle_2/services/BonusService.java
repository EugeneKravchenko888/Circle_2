package ru.netology.javaqa.circle_2.services;
public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // расходы текущие и на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
