public class InClass228 {

    public static void main(String[] args) {
        System.out.println("The sum of your array is " + sumAll());
    }

    public static int sumAll(){
        int[] ints = new int[]{1,2,3,4,5};
        int sum = 0;
//        for (int num : ints){
//         sum += num;
//        }
        for (int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }
}
