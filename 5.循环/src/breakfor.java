public class breakfor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;
//        最多输出10个
        int found = 0;
        int tobefound = 5;

        for (int i = 0; i < 100; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "results" + (divided / divisor));
                found++;

            }
            if (found >= tobefound) {
                System.out.println("已经找到" + tobefound + "个数，循环退出");
                break;
            }
            divided++;
        }

    }
}
