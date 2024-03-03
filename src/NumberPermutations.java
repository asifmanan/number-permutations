public class NumberPermutations {
    public static void main(String[] args) {
//        GreaterPermutation num = new GreaterPermutation();
        getPermutation(546321);
        getPermutation(135642);
    }

    private static int findGreaterThanPivot(int pivot, int[] digits){
        for(int i = digits.length - 1; i > pivot; i--){
            if(digits[i] > digits[pivot]){
                int temp = digits[i];
                digits[i] = pivot;
                digits[pivot] = digits[i];
                break;
            }
        }
        return 0;
    }
    private static int findPivot(int[] digits){
        int pivot = -1;

        for(int i = digits.length-2; i >= 0; i--){
            if(digits[i] < digits[i+1]){
                pivot = i;
                break;
            }
        }
        return pivot;
    }
    public static void getPermutation(int number){
        String numString = Integer.toString(number);

        int[] digits = new int[numString.length()];

        for(int i = 0; i < numString.length(); i++){
            digits[i] = numString.charAt(i) - '0';
        }
        System.out.print("For the number: ");
        for(int digit : digits){
            System.out.print(digit);
        }
        int pivot = findPivot(digits);
//        int greaterThanPivot = findGreaterThanPivot(pivot, digits);
        for(int i = digits.length - 1; i > pivot; i--){
            if(digits[i] > digits[pivot]){
                int temp = digits[i];
                digits[i] = digits[pivot];
                digits[pivot] = temp;
                break;
            }
        }

        int start = pivot + 1;
        int end = digits.length - 1;
        while(start < end){
            int temp = digits[start];
            digits[start] = digits[end];
            digits[end] = temp;
            start++;
            end--;
        }
        System.out.println("\nPivot number is: " + digits[pivot]);
        System.out.print("New Permutation is: ");
        for(int i=0; i < digits.length; i++){
            System.out.print(digits[i]);
        }
        System.out.print("\n");
    }

}
