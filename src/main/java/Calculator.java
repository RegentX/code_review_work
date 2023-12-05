public class Calculator {

        public int add(int a, int b) {
            return a + b;
        }

        public int dif(int a, int b) {
            return a - b;
        }

        public int div(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Нельзя делить на 0");
            }
        }

        public int times(int a, int b) {
            return a * b;
        }

        public int solver() {
            int result = add(5, 3);
            result = times(result, 2);
            result = dif(result, 3);
            result = div(result, 4);

            return result;
        }

}
