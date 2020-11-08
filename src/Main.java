package lessonsSixHW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        StringBuilder output = new StringBuilder();
        try (Scanner sc1 = new Scanner((new File("D:\\Programing\\Geekbrains\\android\\TextFile\\first.txt")));
             Scanner sc2 = new Scanner((new File("D:\\Programing\\Geekbrains\\android\\TextFile\\Second.txt")))) {

            while (sc1.hasNext() || sc2.hasNext()) {
                String s1 = (sc1.hasNext() ? sc1.next() : " ");
                String s2 = (sc2.hasNext() ? sc2.next() : " ");
                output.append(s1).append(" ").append(s2).append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(new File("D:\\Programing\\Geekbrains\\android\\TextFile\\RESULT.txt"))) {
            pw.write(output.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}