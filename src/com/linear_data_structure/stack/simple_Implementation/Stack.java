package com.linear_data_structure.stack.simple_Implementation;

import java.util.Scanner;

public class Stack {

    private static int top=-1;
    private static final int CAPACITY=5;
    private static int arr[]=new int[CAPACITY];
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Pick");
            System.out.println("4. traverse");
            System.out.println("5. exit");
            System.out.print("Please select a number : ");
            int selectedNumber=scanner.nextInt();
            String msg="";
            switch (selectedNumber){
                case 1:
                    System.out.print("Please enter a number to add in Stack : ");
                    int element=scanner.nextInt();
                    push(element);
                    break;
                case 2:
                    int popElement=pop();
                    msg = popElement != -1 ? String.valueOf(popElement) : "Stack is empty"  ;
                    System.out.println("Delete element : "+msg);
                    break;
                case 3:
                    int picElement=pick();
                    msg=picElement != -1 ? String.valueOf(picElement) : "Stack is empty!";
                    System.out.println("Last Inserted Element : "+ msg );
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    System.out.println("Thanks for using our services!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have selected wrong number!!");
            }
        }

    }

    public static void push(int element){
        if (isFull()) System.out.println("Stack is full.");
        else {
            top++;
            arr[top]=element;
//            top++;
        }
    }

    public static int pop(){
        if (isEmpty()) return -1;
        else return arr[top--];
    }

    public static int pick(){
        if (isEmpty()) return -1;
        else return arr[top];
    }

    public static void traverse(){

        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Value from Stack : ");
        for (int i=0;i<=top; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int size(){
        return top+1;
    }

    public static boolean isEmpty(){
        if (top == -1) return true;
        else return false;
    }

    public static boolean isFull(){
        if (top == CAPACITY-1) { return true; }
        else return false;
    }


}
