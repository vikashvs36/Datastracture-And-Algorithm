package com.linear_data_structure.stack.problem;

import java.util.Scanner;
import java.util.Stack;
//import com.linear_data_structure.stack.simple_Implementation.DStack;
import com.util.UtilHelper;

public class Plindrome_string {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check to palindrome or not : ");
        String str= scanner.nextLine();
        String result = checkPalindrome(str) ? "Palindrome" : "Not palindrome";
        System.out.print(result);
    }

    public static boolean checkPalindrome(String str){

        Stack stack =new Stack();
        str = UtilHelper.toLowerCase(str);

        for (int i=0; i<str.length();i++) { stack.push(str.charAt(i)); }

        String rev="";
        while (!stack.isEmpty()){ rev+=stack.pop(); }

        return str.equals(rev);
    }
}
