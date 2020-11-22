package codes;

public class CalculatorClass {

    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int max(int a, int b)
    {
        return Math.max(a,b);
    }
    public int min(int a, int b)
    {
        return Math.min(a,b);
    }
    public int minElement(int[] list)
    {
        int min = list[0];
        for (int a:list
             ) {
            if (a<min) min = a;
        }
        return min;
    }
    public int maxElement(int[] list)
    {
        int max = list[0];
        for (int a:list) {
            if (a>max) max = a;
        }
        return max;
    }
}
