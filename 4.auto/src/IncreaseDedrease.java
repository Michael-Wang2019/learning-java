public class IncreaseDedrease {
    public static void main(String[] args) {
        int a = 1;
//        a = a + 1;
// ++在后面相当于先用再加
        System.out.println("a++=" + a++);
        System.out.println("a=" + a);

        a = 1;
        System.out.println("++a=" + (++a));
        System.out.println("a=" + a);

        int b = 10;
        System.out.println("b--=" + b--);
        System.out.println("b="+ b);
    }
}
