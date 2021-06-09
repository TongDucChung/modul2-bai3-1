package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int size;
	int[] array;
	Scanner scanner=new Scanner(System.in);
	do{
        System.out.println("Nhap vao size");
        size=scanner.nextInt();
        if(size>20){
            System.out.println("Size qua lon");
        }
    }while (size>20);
	array = new int[size];
	int i =0;
	while (i<array.length){
        System.out.println("Nhap vao so o vi tri thu" + (i+1)+":");
        array[i]= scanner.nextInt();
        i++;
    }
	System.out.println("in ra cac phan tu cua mang");
	for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]+"\t");
	}
	for (int j = 0; j < array.length/2; j++) {
	    int temp=array[j];
	    array[j]=array[size-j-1];
	    array[size-1-j]=temp;
	}
        System.out.println("in ra ");
	for (int j = 0; j <array.length ; j++) {
        System.out.println(array[j]+"\t");
        }
    }
}
