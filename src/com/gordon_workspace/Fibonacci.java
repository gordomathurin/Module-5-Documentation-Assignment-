package com.gordon_workspace;

/**
 *
 * @author Gordon Mathurin
 */

public class Fibonacci {

    public Fibonacci() {

    }

    /**
     *
     * @param nth Pass int to check Fibonacci Sequence either recursive method.
     * @return Will return result of Fibonacci Sequence
     */

    public int fibRecursive(int nth) {
        if ((nth  == 0 ) || (nth == 1)) {
            return nth;
        }
        else {

          return fibRecursive(nth-1) + fibRecursive(nth-2);
            }

        }

    /**
     *
     * Used for easy looking when running both functions
     */
        public void separator() {
            System.out.print("==========================================================================\n");
        }

    /**
     *
     * @param nth Pass int to check Fibonacci Sequence either iterative method.
     * @return Will return result of Fibonacci Sequence
     */
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
