public class bit_mov {
    public static void  main(String[] args) {

//>>:符号位不动，其余位右移，符号位后边补0，又称带符号右移。
//>>>:符号位一起右移，左边补0，又称无符号右移。负数右移变为正数。
//<<:左移，右边补0。左移没有带符号位一说，因为符号位在左侧。
//右移1位相当于是除以2的操作。右移2位相当于是除以4的操作。
//左移1位相当于是乘以2的操作。左移2位相当于是乘以4的操作。
//下面的运算，并没有给a赋值，a本身的值是不会有变化的。移位只是用a这个变量来运算。
        int a = 0x400;
        System.out.println(a);
        System.out.println(a >> 1);
        System.out.println(a >> 2);

        System.out.println(a << 1);
        System.out.println(a << 2);

        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 1);
        System.out.println(b >> 2);

        System.out.println(b << 1);
        System.out.println(b << 2);
//涉及到补码的相关知识
        System.out.println(b >>> 1);
        System.out.println(b >>> 2);
    }
}


