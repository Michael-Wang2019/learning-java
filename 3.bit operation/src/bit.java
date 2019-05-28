public class bit {
    public static void main (String[] args) {

        int a = 0xF8;  //        1111 0000

        int b = 0xF4;  //        1111 0100

        int c = 0xff;  //        1111 1111
//        int d = 0x11;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~c);
    }
}
