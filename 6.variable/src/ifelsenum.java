public class ifelsenum {
    public static void main(String[] args) {
        int n = 5;

        String str = n + "对应的中文数字是：";
        if (n == 1) {
            str += "壹";

        } else if (n == 2) {
            str += "贰";
        } else if (n == 3) {
            str += "叁";
        } else if (n == 4) {
            str += "肆";
        } else if (n == 5) {
            str += "伍";
        } else if (n == 6) {
            str += "陆";
        } else if (n == 7) {
            str += "柒";
        } else if (n == 8) {
            str += "捌";
        } else if (n == 9) {
            str += "玖";
        } else {
            System.out.println("错误的值" + n);
        }
        System.out.println(str);
    }

}
