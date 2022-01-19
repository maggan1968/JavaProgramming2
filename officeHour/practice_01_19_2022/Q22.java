package practice_01_19_2022;

import java.util.ArrayList;

public class Q22 {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.remove(nums.size()-1);
        nums.add(2);
        nums.add(10);
        nums.add(0,6);
        nums.remove(1);
        nums.add(-7);
        nums.add(2,2);

        System.out.println(nums);
    }

}
