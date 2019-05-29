public class multitable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                if (j > i) {
                    break;
                }
                line += i + "*" + j + "=" + (j * j) + "\t";
//                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println(line);
        }
    }
}
