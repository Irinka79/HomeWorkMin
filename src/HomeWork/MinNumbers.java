package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Создать новый проект. Написать метод, который принимает список чисел и возвращает минимальное число из списка чисел.
// В main продемонстрировать работу этого метода. Закоммитить, затем запушить эту з-чу в репозиторий.
// Скинуть ссылку на этот репозиторий в чат, либо в личку
public class MinNumbers {
    public static void main(String[] args) {
      int size = 20;
        List<Integer> numbers = new ArrayList<>();
        Random gen = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(i, gen.nextInt(40));

        }
        System.out.println(numbers);
        System.out.println(findMin(numbers));
    }

    public static int findMin(List<Integer> minNumber) {
        int min = Collections.min(minNumber);
        return min;
    }
}



