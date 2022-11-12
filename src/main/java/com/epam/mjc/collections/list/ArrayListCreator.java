package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();

        sourceList.forEach((element) -> {
            int i = sourceList.indexOf(element);
            if (((i + 1) % 3 == 0)) {
                arrayList.add(element);
                arrayList.add(element);
            }
        });
        return arrayList;
    }
}
