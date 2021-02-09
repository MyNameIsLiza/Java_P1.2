package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("ASCII символи і коди:\n № символ OCT  HEX\n");
        System.out.print("ASCII символи і коди:\n № символ OCT  HEX\n");
        for(int i = 33; i < 1425; i++){
            char ch = (char) i;
            String temp_O = Integer.toOctalString(i);
            String temp_H = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", i, ch, temp_O, temp_H);
            fw.write(i + "   " + ch + "     " + temp_O + "   " + temp_H + "\n");
        }
        fw.close();
    }

}
