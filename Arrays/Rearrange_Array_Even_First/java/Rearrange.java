package arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Rearrange {
    public static void main(String args[]) {
        //int a[] = new int[]{3,2,10,4,1,8};
        rearrangeEvens(a);
    }

    private static void rearrangeEvens(List<String> list) {

        List<String> filtered = list.stream().filter(s -> s.length() > 4).collect(Collectors.toList());

    }





}

