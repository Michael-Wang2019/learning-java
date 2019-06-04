public class instance {
    public static void main(String[] args) {

// >> todo 使用new操作符，可以创建一个类的实例/对象(instance/object)
// >> todo 使用new创建一个类的实例后，类中定义的每种变量都会被赋以其类型的初始值。
//>> todo 这个和数组是一样的
//>> todo 使用一个同类型的对象变量，可以指向并操作这个实例。这两点和数组类似。

// 创建一个Merchandise实例，用m1指向它。
        Merchandise m1 = new Merchandise();
        System.out.println("缺省值");
        System.out.println(m1.count);
        System.out.println(m1.price);

//点操作符是用来访问/操作前面实体的属性的，类似于"的"
//merchandise.name可以读作merchandise的name.
        m1.name = "茉莉花茶20包";
        m1.id = "000099518";
        m1.count = 1000;
        m1.price = 99.9;


        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐 330ml";
        m2.id = "000099519";
        m2.count = 1000;
        m2.price = 3.0;


        int m1ToSold = 1;
        System.out.println("thanks to buy" + m1ToSold + "个" + m1.name + "。商品单价为" +
                m1.price + "。消费总价为" + m1.price * m1ToSold + ".");
        m1.count -= m1ToSold;
        System.out.println(m1.id + "剩余库存数量" + m1.count);

        int m2ToSold = 3;
        System.out.println("thanks to buy" + m2ToSold + "个" + m2.name + "。商品单价为" +
                m2.price + "。消费总价为" + m2.price * m2ToSold + ".");

        m2.count -= m2ToSold;
        System.out.println(m2.id + "剩余库存" + m2.count);


    }
}

/*
 从数据类型的角度来看，类就是自己创建类一种新的数据类型。类也叫做"自定义类型"。
 一个java程序中不允许类同名。
 */
