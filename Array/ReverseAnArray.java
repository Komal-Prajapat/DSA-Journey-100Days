public class ReverseAnArray {
   
        public static void main(String arg[]) {
            int ary[] = { 1,3,4,2,3 };

            int n = ary.length;
            for (int i = n-1; i >= 0; i--) {
                System.out.print(  ary[i]+ " ");
            }

        }
    }

