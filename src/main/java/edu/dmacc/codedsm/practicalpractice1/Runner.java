package edu.dmacc.codedsm.practicalpractice1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        java.util.List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("results.txt");

            ListsImpl implementation = new ListsImpl();
            List<String> list1 = implementation.intToString(list);

            for (String line : list1) {
                printWriter.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}
