import java.util.LinkedList;

/*
В LinkedList элементы фактически представляют собой звенья одной цепи.
У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент.
По этим ссылкам можно переходить от одного элемента к другому.
*/
public class LinkedListExample {
    LinkedList <String> list = new LinkedList<>();
    String str1 = "Hello", str2 = " World";
    list.add(str1);
    list.add(str2);
    // теперь str1 и str2 связаны между собой ссылками next и previous
    list.add(1, str2); // ввод на место определенного индекса
    System.out.println(list); // вывод всего листа
    list.revome(1); // удаление одного элемента. А есть еще list.removeFirst() и list.removeLast()
    list.clear(); // очистка
    // <!> Special for Linked List <!> //
    list.addFirst(str1); // добавление в начало списка
    list.addLast(str2); // добавление в конец списка
    list.peekFirst(); // вывод первого элемента
    list.peekLast() // вывод последнего элемента
    list.size(); // вывод числа элементов в листе
    List.toArray(new Array [n]); // вывод элементов списка и перевод его в массив


}
