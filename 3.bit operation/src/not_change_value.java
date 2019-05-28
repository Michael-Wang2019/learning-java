public class not_change_value {
    public static void main(String[] args) {
        int a = 0x400;
        int b = 0xf4;
        int c = 0xff;

        System.out.println(a >> 2);
        System.out.println(~a);
        System.out.println(a | 0x8);

        System.out.println(a);
    }
}
