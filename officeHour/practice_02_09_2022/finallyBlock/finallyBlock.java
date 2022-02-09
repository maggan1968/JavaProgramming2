package practice_02_09_2022.finallyBlock;

public class finallyBlock {
    public static void main(String[] args) {


        readFromDB();
        System.out.println("Line after method");




    }

    public static void readFromDB() {

        Connection connection=new Connection();
        try {
            connection.open();
            String str = null;   // data from database
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is handled");        }
         catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException is handled");        }
         finally {
            connection.close();
        }



    }
}
