package practice_03_09_2022;

public class TryCatch {

    public static void main(String[] args) {

        try {
            int [] arr = new int[1];
            arr[1] = 5;
        }  catch (ArrayIndexOutOfBoundsException e){
            System.out.print("C");
        } catch (RuntimeException e) {
            System.out.print("B");
        }catch (Exception e){
            System.out.print("A");
        }
    }

    }


