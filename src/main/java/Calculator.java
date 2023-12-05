public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        int result = add(2, 3);
        result = times(result, 2);
        result = dif(result, 4);
        result = div(result, 2);
        return result;
    }

}
