// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n<3) return n;
        else return fRecursive(n-1) + 2 * fRecursive(n-2) + 3 * fRecursive(n-3);

    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        int sum = 0;
        if(n<3) return n;
        else {
            int t1 = 0;
            int t2 = 1;
            int t3 = 2;
            for(int i = 3; i<= n;i++) {
                sum = t3 + 2*t2 + 3*t1;
                t1 = t2;
                t2 = t3;
                t3 = sum;
            }
        }
        return sum;
    }
}