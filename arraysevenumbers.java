
import java.util.Arrays;

public class arraysevenumbers {

    public static void main(String[] args) {
        int[] list = {10,5,10,12,8,6,3,8,9,12,6};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int counter=0;

        for (int i=0; i< list.length; i++){
            if(list[i] == list[i+1]){
                int duplicate = list[i];
                if (duplicate%2==0 ){
                    counter++;
                    System.out.println(duplicate +" ");

                }
            }
        }


    }
}
