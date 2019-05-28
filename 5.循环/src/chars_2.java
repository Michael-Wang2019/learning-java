public class chars_2 {
    public static void main(String[] args) {
        char ch = 'a';
        int startNum = ch;

        for (int i = 0; i < 26; i++) {
            System.out.println((startNum + i) + "\t" + (char) (startNum + i));
        }
    }
}
