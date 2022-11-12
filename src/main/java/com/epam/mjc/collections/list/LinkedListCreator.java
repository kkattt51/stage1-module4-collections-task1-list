package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        sourceList.forEach((element) -> {
            if(element % 2 == 0){
                linkedList.addLast(element);
            } else {
                linkedList.addFirst(element);
            }
        });
        return linkedList;
    }
}
