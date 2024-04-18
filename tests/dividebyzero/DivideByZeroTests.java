import org.checkerframework.checker.dividebyzero.qual.*;

class DivideByZeroTests {

    public static void edgeCases() {
        // Using constants in expressions
        // :: error: divide.by.zero
        int a = 10 / (2 - 2);
        int b = 20;
        int c = b / (b - b);
        
        // Function calls that return zero
        // :: error: divide.by.zero
        int d = 1 / getZero();
        
        // Array access
        int[] arr = new int[5];
        arr[0] = 0;
        // :: error: divide.by.zero
        int e = 1 / arr[0];
        
        // Loops and conditions
        for (int i = 0; i < 10; i++) {
            arr[i % 5] = i - 5;
        }
        // :: error: divide.by.zero
        int f = 1 / arr[5];
    }

    public static void moreComplexExpressions() {
        int x = 5, y = 10, z = 15;
        // Complex arithmetic expressions
        int result = x * y + z;
        // :: error: divide.by.zero
        int g = result / (x - x);
        
        // Using results of expressions as divisors
        int divisor = x * (y - y);
        // :: error: divide.by.zero
        int h = z / divisor;
        
        // No error expected here
        int safeDivide = x / (y - (x - 5));
    }

    public static void logicalOperations() {
        int p = 10, q = -10;
        // Using logical operators to control flow
        if (p > 0 && q != 0) {
            int i = 1 / q;  // Safe divide
        }

        // Using conditional operator
        int j = 1 / (p > 5 ? q : 0);
        // :: error: divide.by.zero
    }

    // Function that returns zero
    public static int getZero() {
        return 0;
    }

    public static void callFunctionInExpressions() {
        int k = 10, l = 0;
        // Function in expression
        // :: error: divide.by.zero
        int m = k / (getZero() + l);
    }

    public static void main(String[] args) {
        edgeCases();
        moreComplexExpressions();
        logicalOperations();
        callFunctionInExpressions();
    }
}
