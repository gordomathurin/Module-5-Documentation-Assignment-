package com.gordon_workspace;

public class Fibonacci {

    public Fibonacci() {

    }

    public int fibRecursive(int nth) {
        if ((nth  == 0 ) || (nth == 1)) {
            return nth;
        }
        else {

          return fibRecursive(nth-1) + fibRecursive(nth-2);
            }

        }

        public void separator() {
            System.out.print("==========================================================================\n");
        }


    public int fibIterative (int nth) {
        int fib = 0;
        int num2 = 1;
        for(int i=0; i<nth; i++) {
            int tempNum = fib;
            fib += num2;
            num2 = tempNum;
        }
        return fib;
    }
}
