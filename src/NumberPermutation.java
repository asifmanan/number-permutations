public class NumberPermutation{
    public static void main(String[] args) {
//        GreaterPermutation num = new GreaterPermutation();
        getPermutation(123);
    }


    public static int findPivot(int[] digits){
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

        for(int digit : digits){
            System.out.println(digit);
        }
        int pivot = findPivot(digits);
        System.out.println("Pivot number is: " + digits[pivot]);
    }

}
