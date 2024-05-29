public class MissingNumberInArray {
    public static void main(String arg[]) {
        int ary[] = { 1, 2, 4, 5, 6, 7 };
        int n = ary.length;
        int sum_natural_num = ((n + 1) * (n + 2)) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ary[i];
        }
        int missing_number = sum_natural_num - sum;
        System.out.println("Missing element in an array is " + missing_number);
    }
}


//time complexity O(n)
//Space complexity O(1)