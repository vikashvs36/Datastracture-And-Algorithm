package com.linear_data_structure.stack.dynamic_Implementation.arraylist_based;

import java.util.Scanner;

public class DStack {

    private static int top=-1;
    private static final int INITAL_CAPACITY=10;
    private static int capacity=INITAL_CAPACITY;
    private static int arr[]=new int[capacity];
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Pick\n4. traverse\n5. size\n6. exit");
            System.out.print("Please select a number : ");
            int selectedNumber=scanner.nextInt();
            String msg="";
            switch (selectedNumber){
                case 1:
                    System.out.print("Please enter a number to add in DStack : ");
                    int element=scanner.nextInt();
                    push(element);
                    break;
                case 2:
                    int popElement=pop();
                    msg = popElement != -1 ? String.valueOf(popElement) : "DStack is empty"  ;
                    System.out.println("Delete element : "+msg);
                    break;
                case 3:
                    int picElement=pick();
                    msg=picElement != -1 ? String.valueOf(picElement) : "DStack is empty!";
                    System.out.println("Last Inserted Element : "+ msg );
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    System.out.println("Size : "+size());
                    break;
                case 6:
                    System.out.println("Capacity : "+capacity());
                    break;
                case 7:
                    System.out.println("Thanks for using our services!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have selected wrong number!!");
            }
        }

    }

    public static void push(int element){
        if (isFull()) expand();

        top++;
        arr[top]=element;
    }

    public static int pop(){
        if (isEmpty()) return -1;
        else {
            shrink();
            return arr[top--];
        }
    }

    public static int pick(){
        if (isEmpty()) return -1;
        else return arr[top];
    }

    public static void traverse(){

        if (isEmpty()) {
            System.out.println("DStack is empty!");
            return;
        }

        System.out.print("Value from DStack : ");
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
        if (top == capacity-1) { return true; }
        else return false;
    }

    public static int capacity(){
        return arr.length;
    }

    private static void expand(){
        int size=(size()*3/2)+1;
        int newStack[]=new int[size];
        System.arraycopy(arr, 0, newStack, 0,size());
        arr=newStack;
        capacity=size;
    }

    private static void shrink(){
        int lenght=size();
        if (lenght <= shrinkCapacity()){
            capacity=shrinkCapacity();
            int newArr[]=new int[capacity];
            System.arraycopy(arr,0, newArr, 0, lenght);
            arr=newArr;
        }
    }

    private static int shrinkCapacity(){
        if (capacity() == INITAL_CAPACITY){
            return capacity();
        }
        return capacity()*2/3;
    }


}
