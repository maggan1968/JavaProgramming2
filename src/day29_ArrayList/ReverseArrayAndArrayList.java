package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        /**
         * you create an empty array (here result)with the same length of your array you wanna reverse
         * you use fori loop from the last index to 0
         * you create an additional variable j for index numbers for the empty array result, i is the old array indexes
         * you assign old array element to new result array
         * you print it outside of the loop
         */

        int[] array = {1,2,3,4,5,6};

        int[] result = new int[array.length];  // {6,5,4,3,2,1}

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) {
            result[j]  = array[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("----------interview way for array list reverse-----------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);// we need index thats why we create int each here and we assign
                                   //element one by one from last element to 0
            reversedList.add(each);//we add each to the reversed list

        }


        System.out.println(reversedList);




    }


}
