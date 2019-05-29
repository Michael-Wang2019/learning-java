public class switdetail {
    public static void main(String[] args) {
        int n =15;

        String str = n + "对应的中文数字是：";

        switch (n){
            case 1:
                str+="壹";
                break;
            case 2:
                str+="贰";
            case 3:
                str+="叁";
                break;
            case 4:
                str+="肆";
            case 5:
                str+="伍";
                break;
            case 6:
                str+="陆";
            case 7:
                str+="柒";
                break;
            case 8:
                str+="捌";
            case 9:
                str+="玖";
                break;

                default:
                    System.out.println("错误的值" + n);


        }
        System.out.println(str);
    }

}
/*switch（用于比较的int值，必须是int类型）{
 case目标值1，对应一个if else(xxx):
 匹配后可以执行的语句
 case目标值2，不可以与别的case字句重复：
 匹配后可以执行的语句
 default（对应最后的else,可选）：
 default语句
 }
*/
/*
可以删除break语句看看，会出现什么情况。
switch语句适用于有固定多个目标值匹配，然后执行不同的逻辑情况
必须使用break语句显示的结束一个case子句，否则switch语句会从
第一个匹配的case语句开始执行直到遇到break语句或者switch语句结束。
default子句是可选的，如果所有的case语句都没有匹配上，才会执行default中的代码。

 */