class Palindrom {
    public static void main(String arg[]) {
        int ary[] = { 1, 2, 3, 2, 1 };
        int flag = 0;
        int n = ary.length;
        for (int i = 0; i < n / 2; i++) {
            if (ary[i] != ary[n - i - 1]) {
                flag = 1;
                break;
            }

        }

        if (flag == 1) {

            System.out.println("Not!");

        } else {
            System.out.println("Palindomic ary");

        }
    }
}