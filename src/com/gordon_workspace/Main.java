package com.gordon_workspace;

public class Main {

    public static void main(String[] args) {

        long startTime, endTime;
        int runTime;
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 10; i++) {
            startTime = System.nanoTime();
            int xx = fibonacci.fibRecursive(i);
            endTime = System.nanoTime();
            runTime = (int)((endTime - startTime));
            System.out.println("Recursion answer is " + xx + "\t\t" + "Run time for function was: " + runTime);
        }

       fibonacci.separator();

        for (int i = 1; i <= 10; i++ ) {
            startTime = System.nanoTime();
            int z = fibonacci.fibIterative(i);
            endTime = System.nanoTime();
            runTime = (int)((endTime - startTime));
            System.out.println("Iterative answer is " + z + "\t\t" + "Run time for function was: " + runTime);
        }

    }
}
