package hw;

import java.util.Objects;

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
public class Notebook {

    String oc;
    String ram;
    String ssd;
    String color;

    public Notebook(String oc, String ram, String ssd, String color) {
        this.oc = oc;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Notebook : OC - " + oc + ", RAM - "+ram + ", SSD - " +ssd + ", Color - " + color;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Notebook) {
            Notebook note = (Notebook) o;
        return (note.oc.equals(this.oc) || note.oc.equals("-")) && (note.ram.equals(this.ram) || note.ram.equals("-")) && (note.ssd.equals(this.ssd) || note.ssd.equals("-")) && (note.color.equals(this.color)|| note.color.equals("-")) ;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.oc, this.ram, this.ssd, this.color);
}

}
