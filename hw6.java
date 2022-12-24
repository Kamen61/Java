package hw;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import hw.Notebook;
public class hw6 {
    public static void main(String[] args) {
        // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        // Создать множество ноутбуков.
        // Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
        // Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию: 
        // 1 - ОЗУ
        // 2 - Объем ЖД
        // 3 - Операционная система
        // 4 - Цвет …
        // Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
        // Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
        List<Notebook> allNotebook=List.of(
        new Notebook("Windows 10", "8", "256", "black"),
        new Notebook("Windows 11", "16", "512", "black"),
        new Notebook("MacOS", "8", "256", "gold"),
        new Notebook("MacOS", "16", "512", "grey")
        );

        Scanner line=new Scanner(System.in);
        Map <String,String> params = new LinkedHashMap<String,String>();
        params.put("oc","-");
        params.put("ram","-");
        params.put("ssd","-");
        params.put("color","-");
        System.out.println("Для поиска ноутбука по критериям введите подходящии вам характеристики. Если критерий не интересует , впишите - ");
        System.out.println(params);
        for (String string : params.keySet()) {
            System.out.print(string+" :");
            String tamp=line.nextLine();
            if (!tamp.equals("-")){
                params.put(string,tamp);
            }
        }
        System.out.println(params);

        Notebook note4=new Notebook(params.get("oc"), params.get("ram"), params.get("ssd"), params.get("color"));
        for (Notebook notebook : allNotebook) {
            if (notebook.equals(note4)) System.out.println(notebook);
        }
    }
}
