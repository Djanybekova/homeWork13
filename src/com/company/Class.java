package com.company;

public class Class {
    private int number;
    private String word;
    private int[] arr;

    public Class(String word,int number, int[] arr) {
        this.number=number;
        this.word = word;
        this.arr = arr;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public int[] getArr() {
        return arr;
    }

    void method(String word, int number,  int arr[]){
        System.out.println("Word: "+word+" \nNumber:"+number+" \nArray:{"+arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+"}");
    }
}
