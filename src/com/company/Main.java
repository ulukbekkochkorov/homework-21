package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {fileWriter();
            fileReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileWriter () throws IOException{
       try (FileWriter fw = new FileWriter ("Alphabet.txt")) {
           for (char i = 'A'; i <= 'Z'; i++) {
               fw.write(i);
               fw.write(i + 32);
               fw.write("\n");
           }
           for (int i = 0; i < 10; i++) {
               fw.write(i + "\n");
           }
       }catch (IOException e) {
            e.printStackTrace();
       }       }

    public static void fileReader() throws IOException{
       try (FileReader fr = new FileReader("Alphabet.txt")) {
           Scanner scanner = new Scanner(fr);
           int counter = 1;
        while(scanner.hasNextLine()) {
               System.out.println(counter + ";" + scanner.nextLine());
               counter++;
           }
       }catch (IOException e) {
                e.printStackTrace();
            }
    }}
