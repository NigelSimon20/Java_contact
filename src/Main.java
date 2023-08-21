public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes);
                    results[i] = 0.0d;
                    break;
            }
        }
        System.out.println(results);


//        int a = 10;
//        while(a >= 1){
//            System.out.println(a);
//            a--;
//        }

//        for (int i = 0; i < 100; i++){
//            System.out.println(i);
//        }

//        int[] array = {1,2,3,4};
//
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        };


//        FOR EACH

        String[] cars = {"BMW", "VOLVO", "BENZ"};

        for (String i : cars) {
            System.out.println(i);
        }

//        int[] numbers = new int[4];
//        numbers[0] = 7;
//        numbers[1] = 7;
//        numbers[2] = 7;
//        numbers[3] = 7;
//        int sum = 0;
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.println(numbers[i]);
//            sum = sum + numbers[i];
//        }
//        System.out.println("Sum = " + sum);

        int [] numbers = new int[100];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("the sum is" + sum);

    }
}

