package edu.dmacc.codedsm.practicalpractice1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Runner {
    public static void main(String[] args) throws IOException {


        FileWriter fileWriter = new FileWriter("results.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        ListImplementation implementation2 = new ListImplementation();
        implementation2.inputIntegers();


        ListImplementation implementation = new ListImplementation();

        String result = implementation.addTen();

        printWriter.println(result);
        printWriter.close();

    }
}
