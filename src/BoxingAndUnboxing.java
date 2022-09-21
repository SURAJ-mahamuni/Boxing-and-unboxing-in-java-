import static java.lang.Boolean.TRUE;

public class BoxingAndUnboxing {
    public static void main(String [] args){
        //auto boxing
        //1
        Integer i = new Integer(100);
        Long l = new Long(400);
        Short sh = new Short((short)7187);
        Boolean bl = new Boolean((boolean) TRUE);
        System.out.println(bl);

        //2
        Integer i1 = 10;

        //auto unboxing
        int a = i;


    }
}
