package hw;
import java.io.IOException;
import java.util.logging.*;
import java.util.Arrays;
import java.util.Random;

public class hw2 {
    public static void main(String[] args) {
        // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
        // используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

        // StringBuilder targetStr = new StringBuilder();
        // String[] jsStr = { "name:Ivanov", "country:Russia", "city:null", "age:123" };
        // int len = jsStr.length;
        // int count=0;
        // for (int i = 0; i < len; i++) {
        //     if (jsStr[i].indexOf("null") == (-1)) {
        //         if (count > 0){
        //             targetStr.append(" AND ");
        //         }
        //         targetStr.append(jsStr[i].replace(":", "="));
        //         count++;
        //     }
        // }
        // System.out.println("Часть Where вашего запроса имеет вид: "+targetStr);



        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        Logger logger = Logger.getLogger("BublleSort");
        FileHandler fh;

        try {
            fh = new FileHandler("BublleSort.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);


        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
             e.printStackTrace();
        }

        Random r = new Random();
        int[] mas = new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt();
        }
        System.out.println(mas);
        logger.info("Was :" + Arrays.toString(mas));

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;

                }
            }
        }
        logger.info("Now :" + Arrays.toString(mas));
        System.out.println(Arrays.toString(mas));

    }
}
