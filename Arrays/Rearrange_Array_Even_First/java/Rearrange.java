package arrays;

/**
 * Program to reorder arrays' entries so that the even entries appear first
 * without allocating additional storage.
 */
public class Rearrange {
    public static void main(String args[]) {
        int a[] = new int[]{3,2,10,4,1,8};
        rearrangeEvens(a);
    }

    private static void rearrangeEvens(int[] a) {
        int e = 0; int o = a.length-1;
        while(e < o) {
            if(a[e] % 2 == 0) {
                e++;
            } else {
                int temp = a[e];
                a[e] = a[o];
                a[o--] = temp;
            }
        }
        for(int i = 0 ; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
