public class continus {
    public static void main(String[] args) {
        int divided = 5;
        int divisor = 13;
//        最多输出10个
        int found = 0;
        int tobefound = 3;

        for (int i = 0; i < 100; i++) {
            if(divided<divisor){
                System.out.println(divided+"小于"+divisor+"当前循环跳出");

                divided++;
                continue;
            }

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
