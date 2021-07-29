import java.util.ArrayList;

public class Main{
    
    public static void main(String[] arg) {
        System.out.println("05 김규연");

        boolean hasCard = true;

        ArrayList<String> pocket = new ArrayList<String>
        pocket.add("paper");
        pocket.add("handphone");


        // if (pocket.contains("money")){
        //     System.out.println("택시를 타고 가라");

        // }else {
        //     if (hasCard) {
        //         System.out.println("택시를 타고 가라")

        //     }else {
        //         System.out.println("걸어가라");
        //     }
        // }

        if (pocket.contains("money")){
            System.out.println("택시를 타고 가라");

        }else if(hasCard){
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }


    }

}