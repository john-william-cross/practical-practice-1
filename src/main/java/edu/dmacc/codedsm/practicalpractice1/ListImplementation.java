package edu.dmacc.codedsm.practicalpractice1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ListImplementation implements List {

    @Override
    public List<String> inputIntegers(List list) {
            java.util.List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            java.util.List<String> newList1 = list1.stream()
                    .map(s -> String.valueOf(s))
                    .collect(Collectors.toList());
        return (List<String>) newList1;

        }

        public String addTen() {
            java.util.List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
            java.util.List<Integer> add10 = list2.stream()
                    .map(x -> x + 10)
                    .collect(Collectors.toList());
            return "add 10: " + add10;

        }
}
