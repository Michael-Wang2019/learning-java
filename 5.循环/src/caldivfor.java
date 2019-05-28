public class caldivfor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;
//        最多输出10个
        int found = 0;

        for (int i = 0; i < 100 && found < 10; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "results" + (divided / divisor));
                found++;

            }
            divided++;
        }

    }
}
