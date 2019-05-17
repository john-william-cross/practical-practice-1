package edu.dmacc.codedsm.practicalpractice1;

import java.util.List;
import java.util.stream.Collectors;

public class ListsImpl implements Lists {

    @Override
    public List<String> intToString(List<Integer> list) {

            java.util.List<String> newList = list.stream()
                    .map(s -> "Number was: " + addTen(s))
                    .collect(Collectors.toList());
            return newList;
    }

    public Integer addTen(Integer x) {
        return x + 10;
    }
}
