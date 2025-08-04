package csc143;

import csc143.Fib;

/*******************************************************************************
 * This Test shows a modules recursive, modules iterative and
 * memoized modules recursive implementation
 * of the Fibonacci Sequence to analyze the results.
 *******************************************************************************/
public class FibonacciTest {

    public static long fib(int n) {
        //TODO : COMPLETE BODY OF RECURSIVE METHOD
    	if (n <= 0) {
    		return 0;
    	} else if (n == 1) {
    		return 1;
    	}else {
    		return fib(n - 1) + fib(n -2);
    	}
    }

    public static long ifib(int n) {
    	if (n <= 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            long prev1 = 0;
            long prev2 = 1;
            long current = 0;

            for (int i = 2; i <= n; i++) {
                current = prev1 + prev2;
                prev1 = prev2;
                prev2 = current;
            }
            return current;
        }
    }

    public static long mfib(int n) {
        int[] memo = new int[n + 1];
        return memo(n, memo);
    }

    private static long memo(int n, int[] memo) {
    	if (n <= 0) {
    		return 0;
    	} else if (n == 1) {
    		return 1;
    	}else if (memo[n] != 0){
    		return memo[n];
    	}else {
    		memo[n] = (int) (memo(n - 1, memo) + memo(n - 2, memo));
    		return memo[n];
    	}
    }


    public static void checkIterativeFib(int n){
        System.out.println("\t \t \t I T E R A T I V E   -   ifib(n)");
        System.out.println();
        printHorizontal(FibonacciTest::ifib, n);
        System.out.println();
    }


    /**********************************************************************
    * Test for modules iterative Fibonacci for Large N
    **********************************************************************/
    public static void checkLargeNIteration(int n){
        System.out.println("\t \t \t L A R G E  N   -   ifib(n)");
        System.out.println();
        printVertical(FibonacciTest::ifib, n);
        System.out.println();
    }


    /**********************************************************************
    * Test for memoized Fibonacci for Large N
    **********************************************************************/
    public static void checkLargeNMemoization(int n){
        System.out.println("\t \t \t L A R G E  N   -   mfib(n)");
        System.out.println();
        printVertical(FibonacciTest::mfib, n);
        System.out.println();
    }


    /**********************************************************************
     * Test for the standard modules recursive Fibonacci for Large N
     **********************************************************************/
    public static void checkLargeNRecursion(int n){
        System.out.println("\t \t \t L A R G E  N   -   fib(n)");
        System.out.println();
        printVertical(FibonacciTest::fib, n);
        System.out.println();
    }


    public static void checkMemoizedFib(int n){
        System.out.println("\t \t \t M E M O I Z A T I O N   -   mfib(n)");
        System.out.println();
        printHorizontal(FibonacciTest::mfib, n);
        System.out.println();
    }


    public static void checkRecursiveFib(int n){
        System.out.println("\t \t \t R E C U R S I V E   -   fib(n)");
        System.out.println();
        printHorizontal(FibonacciTest::fib, n);
        System.out.println();
    }


        /****************************************************************
     * prints nth Fibonacci. This uses a functional programming
     * approach to print out the data.
     ****************************************************************/
    public static void printHorizontal(Fib f, int n){
        System.out.println("============== nth Fibonacci ============");

        // PRINTS : count of nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.printf("%d \t", i);
        }
        System.out.println();

        //PRINTS : value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.printf("%d \t", f.fib(i));
        }
        System.out.println();
    }


        /****************************************************************
     * prints large value sequence in lines. This uses a functional
     * programming approach to print out the data.
     ****************************************************************/
    public static void printVertical(Fib f, int n){
        System.out.println("============ R E S U L T S  ============");
        System.out.println();
        System.out.println();
        System.out.println("====== Large Value Printing Ahead ====== ");
        System.out.println();

        //PRINTS : value for nth factorial
        System.out.println("\t \t n \t \t value");
        for (int i = 0; i <= n; i++ ) {
            String str1 = String.format("\t \t %d \t \t %d \n", i, f.fib(i));
            String str2 = String.format("\t \t %d \t %d \n", i, f.fib(i));

            //TERNARY OPERATOR
            String fString = (i < 10) ? str1 : str2;
            System.out.print(fString);
        }

        System.out.println();
    }



    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" F I B O N A C C I    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }


    public static void main(String[] args) {
        intro();

        checkRecursiveFib(11);
        checkMemoizedFib(11);
        checkIterativeFib(11);

        checkLargeNRecursion(45);
        checkLargeNMemoization(45);
        checkLargeNIteration(45);
    }

}
