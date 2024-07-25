package dev.arturo;

import dev.arturo.models.Week;

/**
 * Hello world!
 */
public final class App {
public static void main(String[] args) {

    Week week = new Week();

    System.out.println("The days of the week are" + week.getDaysOfTheWeek().toString());

    System.out.println("The size of our list is of " + week.longList());

    System.out.println("i hate the mondays soooo...do i make bip with monday?" + week.removeArgument("monday"));

    System.out.println(week.getSolicitedDay("friday"));

    System.out.println(week.itExists("Agumon"));

    System.out.println("i am gonna show you the days in alph order" + week.alphabeticOrder());

    System.out.println("sooo...i dont want more days" + week.clearAll());
}
}
    
