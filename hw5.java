package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hw5 {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void addInPhoneBook(Map<String, List<String>> phoneBook)
    {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66"));
    }

    public static void findInPhoneBook(String surname, Map<String, List<String>> phoneBook)
    {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }



    // Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.
    public static void countOfNames(Map<Integer, String> entryList)
    {
        List<String> list = new ArrayList<>(entryList.values());
        Map<Integer, String> states = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            count = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    count++;
                    states.put(count, list.get(i));
                }
            }
        }
        System.out.println(states);
        ArrayList<Integer> keys = new ArrayList<>(states.keySet());
        for (int i = keys.size() - 1; i >= 0; i--)
        {
            System.out.println(states.get(keys.get(i)));
        }
    }




// Реализовать алгоритм пирамидальной сортировки (HeapSort).
    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Задание 1
        // Map<String, List<String>> phoneBook = new HashMap<>();
        // addInPhoneBook(phoneBook);
        // findInPhoneBook("Петров", phoneBook);



        // Задание 2
        // Map<Integer, String> entryList = new HashMap<>();
        // entryList.put(1, "Дима");
        // entryList.put(2, "Вова");
        // entryList.put(3, "Дима");
        // entryList.put(4, "Дима");
        // entryList.put(5, "Вова");
        // entryList.put(6, "Сережа");

        // countOfNames(entryList);


        // Задание 3

        int arr[]={55,44,3,1,22,33,4,566,78,9,776,54,3,8,24,58};
        sort(arr);
        System.out.println();
        printArray(arr);
    }
}
