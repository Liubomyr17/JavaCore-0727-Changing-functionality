package com.company;

/*

0727 Changing functionality
Task: The program enters lines until the user enters an empty line (by pressing enter). Then she converts the strings to uppercase (Mom turns into MOM) and displays them on the screen.
New task: The program enters lines until the user enters an empty line (by pressing enter).
Then the program builds a new list. If the line has an even number of letters, the line doubles; if it is odd, it triples.
The program displays the contents of the new list.
Input Example:
Cat
Cats
I
Output Example:
Cat Cat Cat
Cats cats
I am i

Requirements:
1. The program should read data from the keyboard.
2. The program should output as many lines as were entered.
3. If the line had an even number of letters, then you need to double the line (as in the example).
4. If the line had an odd number of letters, then you need to triple the line (as in the example).
5. The program should stop reading data from the keyboard as soon as the user enters an empty line and press Enter.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while(true) {
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(s);
        }
        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if(s.length() % 2 == 0) {
                listUpperCase.add(i, s + " " + s);
            } else {
                listUpperCase.add(i, s + " " + s + " " + s);
            }
        }
        for (int i=0; i<listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
    }

}








