public class merchanv {
    public static void main(String[] args) {

        String m1Name = "茉莉花茶20包";
        String m1Id = "000099518";
        int m1Count = 1000;
        double m1Price = 99.9;

        String m2Name = "可口可乐 330ml";
        String m2Id = "000099519";
        int m2Count = 1000;
        double m2Price = 3.0;

        int m1ToSold = 1;
        System.out.println("thanks to buy" + m1ToSold + "个" + m1Name + "。商品单价为" +
                m1Price + "。消费总价为" + m1Price * m1ToSold + ".");
        m1Count -= m1ToSold;
        System.out.println(m1Id + "剩余库存数量" + m1Count);

        int m2ToSold = 3;
        System.out.println("thanks to buy" + m2ToSold + "个" + m2Name + "。商品单价为" +
                m2Price + "。消费总价为" + m2Price * m2ToSold + ".");

        m2Count -= m2ToSold;
        System.out.println(m2Id + "剩余库存" + m2Count);


    }
}
