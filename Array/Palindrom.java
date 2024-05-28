class Palindrom{
    public static void main(String arg[]){
        int ary[] = {1,2,3,2,1};
        int newary[];
        int n = ary.length;
    for (int i=0 ; i<= ary.length  ; i--) {
                if(ary[i] != ary[n-i-1]){
                    System.out.println("Not!");
                }
                else{
                    System.out.println("YEs");
                }
       
    }
    }
}