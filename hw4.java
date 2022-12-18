package hw;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class hw4 {
    // Задание 1
    public static LinkedList<Integer> reverse(LinkedList<Integer> arr){
        for (int j = arr.size()-1; j > -1; j--) {
            arr.addLast(arr.get(j));
        }
        int len_arr=arr.size()/2;
        for (int i = 0; i < len_arr; i++) {
            arr.pop();
        }
        return arr;
    }
    // Задание 2
    public static void enqueue(Queue<Integer> arr, int elem){
        boolean a=arr.offer(elem);
        if (a==true){
            System.out.println("Элемент добавлен");
        }
        else{
            System.out.println("Элемент не добавлен");
        }
    }

    public static int dequeue(Queue<Integer> arr){
        return arr.poll();
    }


    public static int first(Queue<Integer> arr){
        return arr.peek();
    }
    public static void main(String[] args) {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        // LinkedList<Integer> arr=new LinkedList<Integer>();
        // for (int i = 0; i < 10; i++) {
        //     arr.add(i);
        // }
        // System.out.println(reverse(arr));


    // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
    // dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
        Queue<Integer> arr=new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            enqueue(arr,i);
        }
        System.out.println(dequeue(arr));
        System.out.println(first(arr));
        System.out.println(arr);
    }
}


