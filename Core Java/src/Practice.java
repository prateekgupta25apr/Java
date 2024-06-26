package src;

import java.util.*;

public class Practice {

    public static void main(String[] args) {
        ArrayList<List<Integer>> inputs=new ArrayList<>();
        inputs.add(Arrays.asList(1,2,100));
        inputs.add(Arrays.asList(2,5,100));
        inputs.add(Arrays.asList(3,4,100));
        ArrayList<Integer> arrayList=new ArrayList<>(Collections.nCopies(5,0));
        System.out.println(arrayList);
        int max=0;
        for (List<Integer> input:inputs){
            for (int i=input.get(0)-1;i<=input.get(1)-1;i++){

                arrayList.set(i,arrayList.get(i)+input.get(2));
                max=Math.max(max,arrayList.get(i));
            }
        }

        System.out.println(max);
        System.out.println(arrayList);
    }
}
