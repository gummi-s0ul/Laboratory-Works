package lab_work1;

public class Task7 {
    public static void main(String[] args) {
        FactorialCounter factorial = new FactorialCounter();

        int number = 7;

        int res = factorial.calculateFactorial(number);

        System.out.println(res);
    }

    static class FactorialCounter{
        public int calculateFactorial(int number){
            int ans = 1;
            for (int i = 1; i <= number; i++) {
                ans *= i;
            }
            return ans;
        }
    }

}


