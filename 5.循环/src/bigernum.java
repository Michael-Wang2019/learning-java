public class bigernum {
    public static void main(String[] args) {
        int a = 99;
        int b = 99;
        int c = 9;

        if (a == b && b == c) {
            System.out.println("a,b and c same num" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a is biger" + a);
                } else {
                    if (a == c) {
                        System.out.println("a and c all biger" + a);
                    } else {
                        System.out.println("c is biger" + c);
                    }
                }
            } else {
                if (b > c) {
                    if (a == b) {
                        System.out.println("a and b same" + a);
                    } else {
                        System.out.println("b is biger" + b);
                    }
                }else {
                    if(c ==b){
                        System.out.println("b and c same"+b);
                    }else {
                        System.out.println("c is biger"+c);
                    }
                }

            }
        }
    }

}


