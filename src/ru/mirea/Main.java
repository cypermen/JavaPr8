package ru.mirea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("Тест конструктора с параметром коллекция, метода toString и remove класса WaitList:");
        WaitList<Integer> wait = new WaitList<>(arr); // Создание списка ожидания wait на основе arr
        System.out.println(wait); // вывод списка ожидания через запятую
        wait.remove();
        System.out.println(wait);//вывод списка после удаления головного

        System.out.println("Тест метода contains и containsAll класса WaitList:");
        ArrayList<Integer> arr1 = new ArrayList<>(arr);
        arr.remove(0);
        System.out.println(wait.contains(2));//элемент 2 содержится в wait, будет напечатан true
        System.out.println(wait.contains(1));//элемент 1 не содержится в wait, будет напечатан false
        System.out.println(wait.containsAll(arr)); // все элементы arr содеражаться в wait, будет напечатан true
        System.out.println(wait.containsAll(arr1));//в wait не содержится элемент 1, будет напичатан false

        System.out.println("Тест конструктора без параметров, метода add, метода isEmpty класса WaitList:");
        WaitList<Integer> wait2 = new WaitList<>();
        System.out.println(wait2.isEmpty());// wait2 пуст , будет напечатано true
        wait2.add(1);
        wait2.add(3);
        wait2.add(5);
        System.out.println(wait2.isEmpty()); // wait2 содержит  1,3,5 , будет напечатано false

        System.out.println("Тест метода add класса BoundedWait");
        BoundedWaitList<Integer> bwait = new BoundedWaitList<>(3);
            bwait.add(1);
            bwait.add(2);
            bwait.add(3);
            bwait.add(4);
        System.out.println( bwait);

        System.out.println("Тест метода moveToBack и remove");
        UnfairWaitList unfwait = new UnfairWaitList();
        unfwait.add(1);
        unfwait.add(2);
        unfwait.add(3);
        unfwait.add(4);
        unfwait.remove(4);
        unfwait.moveToBack();
        System.out.println(unfwait);

    }
}
