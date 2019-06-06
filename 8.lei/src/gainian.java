public class gainian {
    public static void main(String[] args) {
/*
m1是一个Merchandise类型的引用，只能指向Merchandise类型的实例
应用数据类型变量包含两部分信息：类型和实例。也就是说，
每一个引用数据类型的变量（简称应用），都是指向某个类(class/自定义类型）
的一个实例/对象(instance/object)。不同类型的引用在Java的世界里都是应用。
应用的类型信息在创建时就已经确定，可以通过给引用赋值，让其指向不同的实例。
比如，m1就是Merchandise类型，只能指向Merchandise的实例。
 */
        Merchandise m1;
        m1 = new Merchandise();
        Merchandise m2 = new Merchandise();
        Merchandise m3 = new Merchandise();
        Merchandise m4 = new Merchandise();
        Merchandise m5 = new Merchandise();
// >> 给一个应用赋值，则两者的类型必须一样。m5可以给m1赋值，因为他们的类型是一样的。
        m1 = m5;
        System.out.println("m1=" + m1);
        System.out.println("m2=" + m2);
        System.out.println("m3=" + m3);
        System.out.println("m4=" + m4);
        System.out.println("m5=" + m5);

        Merchandise m6 = m1;
        System.out.println("m6=" + m6);
        m6 = m5;
        System.out.println("m6=" + m6);

        System.out.println("m1=" + m1);
        System.out.println("m2=" + m2);
        System.out.println("m3=" + m3);
        System.out.println("m4=" + m4);
        System.out.println("m5=" + m5);

        


// java中的数据类型分为基本数据类型和引用数据类型（数组变量和对象变量）
/*
引用数据类型和基本数据类型的相同点
1。都可以用来创建变量，可以赋值和使用其值
2。本身都是一个地址
引用数据类型和基本数据类型的不同点
1。基本数据变量的值，就是地址对应的值。引用数据类型的值还是一个地址，需要通过"二级跳"
找到实例。
2。引用数据类型是java的一种内部类型，是对所有自定义类型和数组引用的统称，并非
特指某种类型。
 */

    }
}
