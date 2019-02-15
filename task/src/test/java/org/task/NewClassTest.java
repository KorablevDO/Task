package org.task;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by do.korablev on 15.02.2019.
 */
public class NewClassTest {
    /**
     *
     Есть строка, состоящая из слов. Все слова в ней разделены одним пробелом.
     Нужно преобразовать строку в такую структуру данных, которая группирует слова по первой букве в слове. Затем вывести только группы, содержащие более одного элемента.
     Группы должны быть отсортированы в алфавитном порядке по всем буквам в слове.
     Слова внутри группы нужно сортировать по убыванию (по количеству символов);если число символов равное, то сортировать в алфавитном порядке.
     Пример строки: String s = "сапог сарай арбуз болт бокс биржа"
     Отсортированная строка: [б=[биржа, бокс, болт], c=[сaпог, сарай]]
     */
    @Test
    public void test(){
        String line = "сапог сарай арбуз болт бокс биржа";
        NewClass newClass = new NewClass(line);
        List<String> result = newClass.getGroup('с');
        System.out.println(result.toString());
        System.out.println(newClass.getMap());
    }
}