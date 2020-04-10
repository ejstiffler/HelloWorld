package com.DevOps;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.out.println("Hello this is a dummmt Project For testing DevOps");
        for(int i =0; i < 5; i ++){
            Thread.sleep(1000);
            int a  = i+1;
            System.out.println("Hello World ... " +a );
        }
    }
}
