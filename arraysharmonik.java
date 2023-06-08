public class arraysharmonik {
    public static void main(String []args){
        int [] list={1,2,3,4,5};
        double result =0.0;
        for (int i=0; i< list.length; i++){
            result+=(1.0/list[i]);
        }
        System.out.println(list.length/result);
    }
}
