package learning.java.index;

import java.text.MessageFormat;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter Name");
        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
        System.out.println(MessageFormat.format("Hello {0}", name));
    }
}
