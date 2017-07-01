package com.company;

public class Main {


    public int[] Bubble(int[]a){
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];

            for (int j = i-1; j >=0 ; j--) {
                int left =a[j];
                if(left>tmp){
                    a[j+1] = left;
                    a[j] = tmp;
                }else{
                    break;
                }
            }
        }
        return a;
    }

    public int[] Selection(int[] a){
        for(int i = 0; i<a.length-1;i++){
            int index = i;
            for(int j = i+1; j<a.length;j++){
                if(a[i]>a[j])
                    index =j;
                int smallest = a[index];
                a[index] = a[i];
                a[i] = smallest;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Main m = new Main();
        int[] a = {2,-9,-2,8,-3};

        int[] c = {2,-1,1,5,-3,-8};

        //https://ideone.com/4s6LFn
        //bubble
        for (int b : m.Bubble(a)) {
            System.out.print(b + ", ");
        }
        System.out.println();

        for (int b : m.Selection(c)) {
            System.out.print(b + ", ");
        }
    }
}
