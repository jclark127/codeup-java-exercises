public class ExceptionsTest {

    public static void main(String[] args) throws Exception, RuntimeException {
        System.out.println("This prolly works, prolly.");
//        throw new Exception("Whoops, Exception encountered");
//        System.out.println("Good Morning, Sirius.");

        try {
            throw new RuntimeException("Its broken");
        } catch (RuntimeException rE){
            System.out.println(rE.getMessage());
            System.out.println(rE.getLocalizedMessage());
            System.out.println(rE.getCause());
            rE.printStackTrace();
        }

        System.out.println("This code compiles because we handle the exception.");
        test();
    }

    public static void test (){
        System.out.println("this method shows up because we handle the error.");
        System.out.println("But why before the stack trace.");
    }
}
