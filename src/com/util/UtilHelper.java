package com.util;

public class UtilHelper {

    public static void main(String[] args) {
        System.out.println("Lower case : "+toLowerCase("HeLlo"));
    }

    public static String toLowerCase(String str){

        char charArr[]=str.toCharArray();
        String lowercase="";

        for (int i=0; i<charArr.length; i++) {
            int temp=charArr[i];
            if(temp >=65 && temp <=90) temp+=32;
            lowercase+=(char) temp;
        }
        return lowercase;
    }
}
