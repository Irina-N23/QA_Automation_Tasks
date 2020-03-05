// Не используя вспомогательных объектов, переставить отрицательные элементы
// данного списка в конец, а положительные — в начало списка.
package automation.collections.optionaltasks;

import java.util.ArrayList;
import java.util.Collections;

public class TaskFive {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(-5);
        listOfNumbers.add(11);
        listOfNumbers.add(0);
        listOfNumbers.add(-135);
        listOfNumbers.add(201);
        listOfNumbers.add(5462);
        listOfNumbers.add(-4650);

        Collections.sort(listOfNumbers);
        Collections.reverse(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}