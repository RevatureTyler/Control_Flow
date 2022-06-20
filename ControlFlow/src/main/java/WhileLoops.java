public class WhileLoops {

    public WhileLoops(){

    }


    public static void printFirst3Indexes(String[] associates){
        //note we are starting our counter at 2
        //2 is the third index in an array

        //to comment our a block of code: Ctrl + /
//        int count = 2;
//
//        while(count>=8){
//            System.out.println(associates[count]);
//            count--;
//        }

        //the other way to do this is to keep the order
        int count = 0;
        while (count<3){
            System.out.println(associates[count]);
            count++;
        }


    }
}
