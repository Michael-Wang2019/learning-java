import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("your name?");

        String str = in.nextLine();

        System.out.println(str + ",hello");

        System.out.println("how old are you");

        int age = in.nextInt();

        System.out.println("fine," + str +" "+ age+" "+"years old");
    }
}
