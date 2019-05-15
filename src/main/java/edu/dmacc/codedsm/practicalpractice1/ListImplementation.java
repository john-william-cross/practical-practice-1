package edu.dmacc.codedsm.practicalpractice1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListImplementation implements List {

    @Override
    public List<String> inputIntegers(List list) {
        
            java.util.List<Integer> theList = Arrays.asList(1, 2, 3, 4, 5);
            java.util.List<String> newList = theList.stream()
                    .map(s -> String.valueOf(s))
                    .collect(Collectors.toList());
            return (List<String>) newList;

        }

        public String addTen() {
            java.util.List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            java.util.List<Integer> add10 = list.stream()
                    .map(x -> x + 10)
                    .collect(Collectors.toList());
            return "add 10: " + add10;

        }
}
